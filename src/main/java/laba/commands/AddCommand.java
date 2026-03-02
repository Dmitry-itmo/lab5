package commands;

import data.Chapter;
import data.Coordinates;
import data.SpaceMarine;
import exceptions.IncorrectCommandException;
import utility.CollectionManager;
import static utility.ConsoleManager.*;

public class AddCommand implements Command{


    @Override
    public void execute(){

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
            System.out.println("Введите координату Y: ");
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
                System.out.println("Введите одну из категорий Inceptor, Supressor, Terminator, Chaplain, Apothecary");
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
        
        CollectionManager.addSpaceMarine(spaceMarine);

        System.out.println("Элемент добавлен в коллекцию");
        
    }

    @Override
    public String toString() {
        return "add - добавляет новый элемент в коллекцию";
    }
}
