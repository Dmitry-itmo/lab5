package commands;

import java.util.ArrayList;
import java.util.HashSet;

import data.Chapter;
import data.SpaceMarine;
import sorter.SortByChapterName;
import utility.CollectionManager;

public class PrintFieldAscendingChapterCommand implements Command{
    @Override
    public void execute() {
        if (CollectionManager.getCollection().size() == 0) {
            System.out.println("В коллекции нет элементов");
            return;
        }
        HashSet<SpaceMarine> hashSet = CollectionManager.getCollection();
        ArrayList<Chapter> list = new ArrayList<>();
        for (SpaceMarine spaceMarine : hashSet) {
            list.add(spaceMarine.getChapter());
        }
        list.sort(new SortByChapterName());

        for (Chapter chapter : list) {
            System.out.println();
            System.out.println(chapter);
        }
    }

    @Override
    public String toString() {
        return "print_field_ascending_chapter - выводит значения поля chapter всех элементов в порядке возрастания";
    }
}
