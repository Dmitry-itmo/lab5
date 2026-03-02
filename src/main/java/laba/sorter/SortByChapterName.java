package sorter;

import java.util.Comparator;
import data.Chapter;

public class SortByChapterName implements Comparator<Chapter>{
    public int compare(Chapter chapter1, Chapter chapter2) {
        return chapter1.getName().compareTo(chapter2.getName()); 
    }
    
}
