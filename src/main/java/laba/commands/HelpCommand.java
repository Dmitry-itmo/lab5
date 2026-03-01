package commands;

import java.util.Map;

import utility.CommandManager;

public class HelpCommand implements Command{
    
    public void execute() {
        for (Map.Entry<String, Command> entry : CommandManager.getCommands().entrySet()) {
            System.out.println(entry.getValue());
        }
    }

    @Override
    public String toString() {
        return "help - выводит справку по доступным командам";
    }

}
