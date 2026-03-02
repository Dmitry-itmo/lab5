package utility;

import java.util.HashMap;

import Exceptions.*;
import commands.*;

public class CommandManager {

    private static HashMap<String,Command> commands = new HashMap<>();

    

    static {
        commands.put("help", new HelpCommand());
        commands.put("exit", new ExitCommand());
        commands.put("history", new HistoryCommand());
        commands.put("add", new AddCommand());
        commands.put("info", new InfoCommand());
        commands.put("show", new ShowCommand());
        commands.put("clear", new ClearCommand());
        commands.put("remove", new RemoveCommand());
        commands.put("update", new UpdateCommand());
        commands.put("print_ascending", new PrintAscending());
        commands.put("print_descending", new PrintDescending());
    }

   

    public static HashMap<String, Command> getCommands() {
        return commands;
    }


    public void useCommand(String userLine) throws IncorrectCommandException{
        String[] wordsInLine = userLine.split(" ");
        String firstWord = wordsInLine[0];
        try {
            if (wordsInLine.length == 1) {
                commands.get(firstWord).execute();
            } else {
                commands.get(firstWord).execute(wordsInLine[1]);
            } 
            HistoryCommand.addCommand(firstWord);
        }catch (IncorrectIDException e) {
            System.out.println("Неправильный ID");
        } catch (Exception e) {
            throw new IncorrectCommandException();

        }



    }


}
