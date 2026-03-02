package exceptions;

public class IncorrectIDException extends Exception {

    @Override
    public String getMessage() {
        return "Incorrect ID";
    }
    
}
