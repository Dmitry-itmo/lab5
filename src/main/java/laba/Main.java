package laba;

import laba.exceptions.*;
import laba.utility.*;
/**
 * @author Romanov Dmitry
 */
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