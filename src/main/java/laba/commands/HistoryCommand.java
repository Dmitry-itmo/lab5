package commands;

import java.util.ArrayDeque;

public class HistoryCommand implements Command{
    private static ArrayDeque<String> historyCommand = new ArrayDeque<>();

    public static void addCommand(String command) {
        if (historyCommand.size() < 9) {
            historyCommand.addLast(command);
        } else {
            historyCommand.removeFirst();
            historyCommand.addLast(command);
        }
    }

    
    @Override
    public void execute() {
        for (String command : historyCommand) {
            System.out.println(command);
        }
    }

    @Override
    public String toString() {
        return "history - выводит последние 9 команд (без их аргументов)";
    }
}
