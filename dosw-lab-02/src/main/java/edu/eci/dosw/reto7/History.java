import java.time.LocalDateTime;

/**
 * Class that will save the details of an action
 */

public class History{
    private String user;
    private boolean undone;
    private LocalDateTime actionTime;
    private Command action;

    public History(String user, boolean undone, Command action){
        this.user = user;
        this.undone = undone;
        this.action = action;
        this.actionTime = LocalDateTime.now();
    }

    public String getUser() { 
        return user;
    }

    public boolean getUndone() { 
        return undone; 
    }
    public LocalDateTime getActionTime() { 
        return actionTime; 
    }
    
    public String commandName() { 
        return action.getName(); 
    }

    public Command getCommand(){
        return action;
    }

    public void markUndone() { 
        this.undone = true; 
    }
}