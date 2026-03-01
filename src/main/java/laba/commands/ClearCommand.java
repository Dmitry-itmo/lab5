package commands;

import utility.CollectionManager;

public class ClearCommand implements Command{
    @Override
    public void execute() {
        CollectionManager.removeCollection();
    }    
}
