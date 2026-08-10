package edu.eci.dosw.reto7;
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
 
    public void setPastState() {
        if (pastAction) 
            light.setOn(true); 
        else 
            light.setOn(false);
    }

        public String getName(){
        if(newAction)
            return "Turn lights on";
        else
            return "Turn lights off";
    }

    public String getDeviceInvolved(){
        return "LIGHT";
    }
}