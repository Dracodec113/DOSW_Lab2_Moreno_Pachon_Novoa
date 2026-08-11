package edu.eci.dosw.reto7;
/**
 * Class that models a door
 */

public class Door{
    private String name;
    private boolean open;

    public Door(String name){
        this.name = name;
        this.open = false;
    }

    public String getName(){
        return name;
    }

    public void setOpen(boolean value){
        this.open = value;
    }

    public boolean isOpen(){
        return open;
    }
}
