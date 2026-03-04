package laba.utility;

import java.time.LocalDate;
import java.util.HashSet;

import laba.data.SpaceMarine;
import laba.exceptions.IncorrectIDException;

/**
 * The class is responsible for storing and processing the collection
 */

public class CollectionManager {
    private static HashSet<SpaceMarine> collection = new HashSet<>();
    private static java.time.LocalDate creationDate = LocalDate.now();

    public static void addSpaceMarine(SpaceMarine spaceMarine) {
        collection.add(spaceMarine);
    }

    public static java.time.LocalDate getCreationDate() {
        return creationDate;
    }


    /**
     * 
     * @param id
     * @return Returns a collection item with a specific ID
     * @throws IncorrectIDException
     */
    public static SpaceMarine searchSpaceMarine(Integer id) throws IncorrectIDException{
        for (SpaceMarine spaceMarine : collection) {
            if (spaceMarine.getId().equals(id)) {
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
