package laba.commands;

import laba.utility.FileManager;

/**
 * The command saves the collection to an xml file.
 */
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
