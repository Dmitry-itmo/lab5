package commands;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

import exceptions.IncorrectCommandException;
import exceptions.IncorrectIDException;
import utility.CommandManager;

public class ExecuteScriptCommand implements Command{
    @Override
    public void execute() {
        System.out.println("Нужен имя файла");
    }

    @Override
    public void execute(String path) throws IncorrectCommandException, IncorrectIDException {
        BufferedReader reader = null;
        String script = "";
        try {
            reader = new BufferedReader(
                        new InputStreamReader(
                            new FileInputStream("script\\"+path), "UTF-8"));
            String line;
            StringBuilder result = new StringBuilder();

            while ((line = reader.readLine()) != null) {
                result.append(line).append("\n");
            }

            script = result.toString();
            
        } catch (IOException e) {
            System.err.println(e);
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                System.err.println(e);
            }
        }

        String[] commands = script.split("\n");
        for (String command : commands){
            if (command.contains("execute_script")) {
                throw new IncorrectCommandException();
            }
            CommandManager.useCommand(command);
        }


    }

    @Override
    public String toString() {
        return "execute_script - считает и исполняет скрипт из указанного файла";
    }
}
