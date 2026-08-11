package edu.eci.dosw.reto7;
/**
 * Class that models a music system
 */

public class MusicSystem{
    private String name;
    private int volume;

    public MusicSystem(String name){
        this.name = name;
        this.volume = 0;
    }

    public String getName(){
        return name;
    }

    public void setVolume(int value){
        this.volume = value;
    }

    public int getVolume(){
        return volume;
    }
}