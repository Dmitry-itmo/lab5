package utility;

import java.time.LocalDate;
import java.util.HashSet;

import Exceptions.IncorrectIDException;
import data.SpaceMarine;

public class CollectionManager {
    private static HashSet<SpaceMarine> collection = new HashSet<>();
    private static java.time.LocalDate creationDate = LocalDate.now();

    public static void addSpaceMarine(SpaceMarine spaceMarine) {
        collection.add(spaceMarine);
    }

    public static java.time.LocalDate getCreationDate() {
        return creationDate;
    }

    public static SpaceMarine searchSpaceMarine(Integer id) throws IncorrectIDException{
        for (SpaceMarine spaceMarine : collection) {
            if (spaceMarine.getId() == id) {
                return spaceMarine;
            }
        }
        throw new IncorrectIDException();
    }

    

    public static void removeElement(SpaceMarine spaceMarine) {
        collection.remove(spaceMarine);
    }

    public static void removeCollection() {
        collection = new HashSet<>();
    }

    public static HashSet<SpaceMarine> getCollection() {
        return collection;
    } 
}
