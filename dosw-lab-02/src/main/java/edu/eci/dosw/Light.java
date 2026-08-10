/**
 * Class that models a light
 */

public class Light{
    private String name;
    private boolean on;

    public Light(String name){
        this.name = name;
        this.on = false;
    }

    public String getName(){
        return name;
    }

    public void setOn(boolean value){
        this.on = value;
    }

    public boolean isOn(){
        return on;
    }
}