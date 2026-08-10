/**
 * Class that models a window blind
 */

public class WindowBlind{
    private String name;
    private int position;

    public WindowBlind(String name){
        this.name = name;
        this.position = 0;
    }

    public String getName(){
        return name;
    }

    public void setPosition(int value){
        this.position = value;
    }

    public int getPosition(){
        return position;
    }
}