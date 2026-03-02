package sorter;

import java.util.Comparator;

import data.SpaceMarine;

public class SortBySpaceMarineNameReverse implements Comparator<SpaceMarine>{

    @Override
    public int compare(SpaceMarine spaceMarine1, SpaceMarine spaceMarine2) {
        return -1 * spaceMarine1.getName().compareTo(spaceMarine2.getName());
    }
    
}
