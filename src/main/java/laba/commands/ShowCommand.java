package commands;

import data.SpaceMarine;
import utility.CollectionManager;

public class ShowCommand implements Command{
    @Override
    public void execute() {
        if (CollectionManager.getCollection().size() == 0) {
            System.out.println("В коллекции нет элементов");
            return;
        }
        for (SpaceMarine spaceMarine : CollectionManager.getCollection()) {
            System.out.println();
            System.out.println(spaceMarine);
        }
    }
    
    @Override
    public String toString() {
        return "show - выводит все элементы коллекции в строковом представлении";
    }

}
