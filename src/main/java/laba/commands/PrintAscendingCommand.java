package commands;

import sorter.SortBySpaceMarineName;
import java.util.ArrayList;

import data.SpaceMarine;
import utility.CollectionManager;

public class PrintAscendingCommand implements Command{
    @Override
    public void execute() {
        if (CollectionManager.getCollection().size() == 0) {
            System.out.println("В коллекции нет элементов");
            return;
        }
        ArrayList<SpaceMarine> list = new ArrayList<>(CollectionManager.getCollection());
        list.sort(new SortBySpaceMarineName());

        for (SpaceMarine spaceMarine : list) {
            System.out.println();
            System.out.println(spaceMarine);
        }
    }

    @Override
    public String toString() {
        return "print_ascending - выводит элементы коллекции в порядке возрастания";
    }
}
