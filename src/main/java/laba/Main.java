import Exceptions.*;
import utility.*;

public class Main {
    public static void main(String[] args){
        CommandManager commandManager = new CommandManager();
        
        while (true) {
            String userLine = ConsoleManager.readLine();
            try {  
                commandManager.useCommand(userLine); 
            } catch (IncorrectCommandException e) {
                System.err.println(e.getMessage());
            }  
        }
        

    }
} 