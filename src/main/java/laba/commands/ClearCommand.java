package laba.commands;

import laba.utility.CollectionManager;
/**
 * Clears the collection
 */
public class ClearCommand implements Command{
    @Override
    public void execute() {
        CollectionManager.removeCollection();
    }
    
    @Override
    public String toString() {
        return "clear - очищает коллекцию";
    }
}
