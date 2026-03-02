package commands;

import java.util.ArrayList;

import data.SpaceMarine;
import sorter.SortBySpaceMarineNameReverse;
import utility.CollectionManager;

public class PrintDescending implements Command{
    @Override
    public void execute() {
        if (CollectionManager.getCollection().size() == 0) System.out.println("В коллекции нет элементов");
        ArrayList<SpaceMarine> list = new ArrayList<>(CollectionManager.getCollection());
        list.sort(new SortBySpaceMarineNameReverse());

        for (SpaceMarine spaceMarine : list) {
            System.out.println();
            System.out.println(spaceMarine);
        }
    }

    @Override
    public String toString() {
        return "print_descending - выводит элементы коллекции в порядке убывания";
    }
    
}
