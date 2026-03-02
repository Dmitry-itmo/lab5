package sorter;

import java.util.Comparator;

import data.SpaceMarine;

public class SortBySpaceMarineName implements Comparator<SpaceMarine>{
    @Override
    public int compare(SpaceMarine spaceMarine1, SpaceMarine spaceMarine2) {
        return spaceMarine1.getName().compareTo(spaceMarine2.getName());
    }
    
}
