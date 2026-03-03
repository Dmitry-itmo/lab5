package sorter;

import java.util.Comparator;

import data.SpaceMarine;

public class SortBySpaceMarineID implements Comparator<SpaceMarine>{
    @Override
    public int compare(SpaceMarine spaceMarine1, SpaceMarine spaceMarine2) {
        return spaceMarine1.getId() - spaceMarine2.getId();
    }
}
