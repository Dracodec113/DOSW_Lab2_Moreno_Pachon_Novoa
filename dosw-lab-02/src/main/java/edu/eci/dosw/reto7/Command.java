package edu.eci.dosw.reto7;
/**
 * Interface that will stablish an execute contract for all the possible 
 * remote control commands
 */

public interface Command{
    public void execute();
    public String getName();
    public String getDeviceInvolved();
    public void setPastState();
}