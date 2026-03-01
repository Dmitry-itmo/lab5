package Exceptions;

public class IncorrectCommandException extends Exception{

    @Override
    public String getMessage() {
        return "Incorrect Command \nUse command help";
    }
}
