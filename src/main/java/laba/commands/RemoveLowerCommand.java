package commands;

import java.util.ArrayList;

import data.SpaceMarine;
import exceptions.IncorrectCommandException;
import exceptions.IncorrectIDException;
import sorter.SortBySpaceMarineName;
import utility.CollectionManager;

public class RemoveLowerCommand implements Command{
    @Override
    public void execute() {
        System.out.println("Нужен ID");
    }

    @Override
    public void execute(String id) throws IncorrectCommandException, IncorrectIDException {
        ArrayList<SpaceMarine> list = new ArrayList<>(CollectionManager.getCollection());
        list.sort(new SortBySpaceMarineName());
        
        SpaceMarine spaceMarine = CollectionManager.searchSpaceMarine(Integer.parseInt(id));
        int index = list.indexOf(spaceMarine);
        for (int i = index-1; i >= 0; i--) {
            CollectionManager.removeElement(list.get(i));
            SpaceMarine.removeID(list.get(i).getId());
            System.out.println("Элемент с ID " + list.get(i).getId() + " удален");
        }
        
        
    }

    @Override
    public String toString() {
        return "remove_lower - удаляет из коллекции все элементы, меньшие, чем заданный";
    }
}
