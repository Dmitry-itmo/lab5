package commands;

import java.util.ArrayList;

import data.SpaceMarine;
import utility.CollectionManager;

public class PrintAscending implements Command{
    @Override
    public void execute() {
        ArrayList<SpaceMarine> list = new ArrayList<>(CollectionManager.getCollection());
        
    }

    @Override
    public String toString() {
        return "print_ascending - выводит элементы коллекции в порядке возрастания";
    }
}
