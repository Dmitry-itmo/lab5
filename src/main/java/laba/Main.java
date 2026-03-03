import exceptions.*;
import utility.*;

public class Main {
    public static void main(String[] args){
        FileManager.load();
        while (true) {
            String userLine = ConsoleManager.readLine();
            try {  
                CommandManager.useCommand(userLine); 
            } catch (IncorrectCommandException e) {
                System.err.println(e.getMessage());
            }  
        }
    }
} 