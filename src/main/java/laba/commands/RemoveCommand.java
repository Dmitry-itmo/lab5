package commands;

import utility.CollectionManager;
import data.*;
import exceptions.*;

public class RemoveCommand implements Command{
    @Override
    public void execute() {
        System.out.println("Нужен ID");
    }

    public void execute(String id) throws IncorrectCommandException, IncorrectIDException{
        SpaceMarine spaceMarine = CollectionManager.searchSpaceMarine(Integer.parseInt(id));
        CollectionManager.removeElement(spaceMarine);
        SpaceMarine.removeID(Integer.parseInt(id));
        System.out.println("Элемент с ID " + id + " удален");
    } 

    @Override
    public String toString() {
        return "remove - удаляет элемент из коллекции по его ID";
    }
    
}
