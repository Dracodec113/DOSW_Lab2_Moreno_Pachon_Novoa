/**
 * Class that manages the possible lights actions
 */

public class LightCommandAction implements Command{
    private Light light;
    private boolean pastAction;
    private boolean newAction;
 
    public LightCommandAction(Light light, boolean newState) {
        this.light = light;
        this.newAction = newState;
    }
 
    public void execute() {
        changeState();
    }
 
    public void changeState() {
        this.pastAction = light.isOn();

        if (newAction) 
            light.setOn(true); 
        else 
            light.setOn(false);
    }
 
    public boolean pastState() {
        if (pastAction) 
            light.setOn(true); 
        else 
            light.setOn(false);
        
        return pastAction;
    }
}