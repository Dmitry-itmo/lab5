package laba.commands;

import java.util.ArrayList;

import laba.data.SpaceMarine;
import laba.sorter.SortBySpaceMarineNameReverse;
import laba.utility.CollectionManager;
/**
 * A command that outputs the elements of a collection in descending order
 */
public class PrintDescendingCommand implements Command{
    @Override
    public void execute() {
        if (CollectionManager.getCollection().size() == 0) {
            System.out.println("В коллекции нет элементов");
            return;
        }
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
