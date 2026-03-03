package commands;

import utility.FileManager;


public class SaveCommand implements Command{
    @Override
    public void execute() {
        FileManager.save();
    }

    @Override
    public String toString() {
        return "Сохраняет коллекцию в файл";
    }
}
