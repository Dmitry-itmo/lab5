package commands;

import java.util.ArrayList;
import java.util.HashSet;

import data.Chapter;
import data.SpaceMarine;
import sorter.SortByChapterName;
import utility.CollectionManager;

public class PrintFieldAscendingChapter implements Command{
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
}
