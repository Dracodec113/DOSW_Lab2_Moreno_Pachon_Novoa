import java.util.Scanner;

/**
 * Class that manages the possible music system actions
 */

public class MusicSystCommandAction implements Command{
    private MusicSystem musicSyst;
    private int pastValue;
    private int newValue;
    Scanner read = new Scanner(System.in);
 
    public MusicSystCommandAction(MusicSystem musicSyst, int newState) {
        this.musicSyst = musicSyst;
        this.newValue = newState;
    }
 
    public void execute() {
        int value = read.nextInt();
        changeState(value);
    }
 
    public void changeState(int value) {
        this.pastValue = musicSyst.getVolume();
        musicSyst.setVolume(value);
    }
 
    public void setPastState() {
        musicSyst.setVolume(pastValue);
    }

    public String getName(){
        if(newValue>pastValue)
            return "Turn down the volume";
        else if (newValue<pastValue)
            return "Turn up the volume";
        else
            return "Maintain the volume";
    }

    public String getDeviceInvolved(){
        return "MUSIC_SYSTEM";
    }
}