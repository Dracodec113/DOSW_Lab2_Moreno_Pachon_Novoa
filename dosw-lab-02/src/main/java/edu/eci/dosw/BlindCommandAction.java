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
 
    public int pastState() {
        blind.setPosition(pastValue);
        return pastValue;
    }
}