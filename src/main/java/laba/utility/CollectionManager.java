package laba.utility;

import java.time.LocalDate;
import java.util.HashSet;

import laba.data.Chapter;
import static laba.utility.ConsoleManager.*;
import laba.data.Coordinates;
import laba.data.SpaceMarine;
import laba.exceptions.IncorrectCommandException;
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

    public static SpaceMarine addElementSpaceMarine() {
        SpaceMarine spaceMarine = new SpaceMarine();
        System.out.println("Введите имя коробля: ");
        spaceMarine.setName(readLine());
        Coordinates coordinates = new Coordinates(0,0);
        Chapter chapter = new Chapter();
        
        while (true) {
            System.out.println("Введите координату X: ");
            try {
                coordinates.setX(Long.parseLong(readLine()));
                break;
            } catch (NumberFormatException e) {
                System.err.println("Введите целое число!");
            }
        }
        while (true) {
            System.out.println("Введите координату Y (Y > -192): ");
            try {
                coordinates.setY(Float.parseFloat(readLine()));
                break;
            } catch (NumberFormatException e) {
                System.err.println("Введите число!");
            } catch (IncorrectCommandException e) {
                System.err.println("Число должно быть больше -192");
            }
        }
        while(true) {
            System.err.println("Введите здоровье (число больше 0)");
            try {
                spaceMarine.setHealth(Long.parseLong(readLine()));
                break;
            } catch (NumberFormatException e) {
                System.err.println("Введите число!");
            } catch (IncorrectCommandException e) {
                System.err.println("Число должно быть больше 0");
            }
        }

        while(true) {
            try {
                System.out.println("Введите одну из категорий INCEPTOR, SUPPRESSOR, Terminator, Chaplain, Apothecary");
                spaceMarine.setCategory(readLine());
                break;
            } catch(IncorrectCommandException e) {
                System.err.println("Неправильно введенный тип");
            }
        }

        while(true) {
            try {
                System.out.println("Введите одну из категорий Chain sword, Chain axe, Manreaper, Power Fist");
                spaceMarine.setMeleeWeapon(readLine());
                break;
            } catch(IncorrectCommandException e) {
                System.err.println("Неправильно введенный тип");
            }
        }

        while(true) {
            try {
                System.out.println("Введите одну из категорий Combi flamer, Combi plasma gun, Flamer");
                spaceMarine.setWeaponType(readLine());
                break;
            } catch(IncorrectCommandException e) {
                System.err.println("Неправильно введенный тип");
            }
        }

        spaceMarine.setCoordinates(coordinates);
        spaceMarine.setChapter(chapter);
        System.out.println("Введите name Chapter: ");
        chapter.setName(readLine());

        System.out.println("Введите world Chapter: ");
        chapter.setWorld(readLine());
        return spaceMarine;
    }
    
}
