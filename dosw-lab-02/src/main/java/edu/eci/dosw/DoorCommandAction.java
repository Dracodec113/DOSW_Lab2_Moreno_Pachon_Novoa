/**
 * Class that manage the possible door actions
 */

public class DoorCommandAction implements Command{
    private Door door;
    private boolean pastAction;
    private boolean newAction;
 
    public DoorCommandAction(Door door, boolean newState) {
        this.door = door;
        this.newAction = newState;
    }
 
    public void execute() {
        changeState();
    }
 
    public void changeState() {
        this.pastAction = door.isOpen();

        if (newAction) 
            door.setOpen(true); 
        else 
            door.setOpen(false);
    }
 
    public boolean pastState() {
        if (pastAction) 
             door.setOpen(true); 
        else 
            door.setOpen(false);
        
        return pastAction;
    }
}