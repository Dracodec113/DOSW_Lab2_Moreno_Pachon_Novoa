package edu.eci.dosw.reto7;
import java.util.Scanner;

/**
 * Class that manages the possible window blind actions
 */


public class BlindCommandAction implements Command{
    private WindowBlind blind;
    private int pastValue;
    private int newValue;
    Scanner read = new Scanner(System.in);
 
    public BlindCommandAction(WindowBlind blind, int newState) {
        this.blind = blind;
        this.newValue = newState;
    }
 
    public void execute() {
        int value = read.nextInt();
        changeState(value);
    }
 
    public void changeState(int value) {
        this.pastValue = blind.getPosition();
        blind.setPosition(value);
    }
 
    public void setPastState() {
        blind.setPosition(pastValue);
    }

    public String getName(){
        if(newValue == pastValue)
            return "Maintain hte same position";
        else
            return "Change the position";
    }

    public String getDeviceInvolved(){
        return "WINTER_BLIND";
    }
}