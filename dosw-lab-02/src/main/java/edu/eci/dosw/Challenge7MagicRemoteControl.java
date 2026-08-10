import java.util.Scanner;

/**
 * Main class of challenge 7 solution
 */

public class Challenge7MagicRemoteControl{

    private static String[] DEVICES = {"DOOR", "LIGHT", "MUSIC_SYSTEM", "WINTER_BLIND"};
 
    public static void run(){
        Scanner scanner = new Scanner(System.in);
        RemoteControl remote = new RemoteControl();
 
        Door frontDoor = new Door("Principal door");
        Light livingRoomLight = new Light("Living room light");
        MusicSystem kitchenMusicSyst = new MusicSystem("Kitchen music system");
        WindowBlind bedroomBlind = new WindowBlind("Bedroom window blind");
 
        boolean running = true;
 
        while (running) {
            System.out.println("\n Challenge_7: Magic remote control");

            System.out.println("1. Open/close the door");
            System.out.println("2. Turn light on/off");
            System.out.println("3. Set music volume");
            System.out.println("4. Set blind position");
            System.out.println("5. Undo the last action");
            System.out.println("6. Show history and exit");
            System.out.print("Choose an option: \n");
 
            int option = scanner.nextInt();
            Command command = null;
            int decision;
            boolean boolValue = true;
            int intValue = 0;
 
            switch (option) {
                case 1:
                    System.out.println("Write 1 for opening or 2  for closing \n");
                    decision = scanner.nextInt();
                    if (decision == 2)
                        boolValue = false;
                    command = new DoorCommandAction(frontDoor, boolValue);
                    remote.executeCommand(command);
                    break;
 
                case 2:
                    System.out.println("Write 1 for turning on or 2  for turning off \n");
                    decision = scanner.nextInt();
                    if (decision == 2)
                        boolValue = false;
                    command = new LightCommandAction(livingRoomLight, boolValue);
                    remote.executeCommand(command);
                    break;
 
                case 3:
                    System.out.println("Write your desire volume \n");
                    intValue = scanner.nextInt();
                    command = new MusicSystCommandAction(kitchenMusicSyst, intValue);
                    remote.executeCommand(command);
                    break;
 
                case 4:
                    System.out.println("Write your desire position \n");
                    intValue = scanner.nextInt();
                    command = new BlindCommandAction(bedroomBlind, intValue);
                    remote.executeCommand(command);
                    break;
 
                case 5:
                    remote.undoCommand();
                    break;
 
                case 6:
                    running = false;
                    break;
 
                default:
                    System.out.println("Invalid option");
            }
            
        }
 
        remote.showHistory();
    }

 
    public static void main(String[] args) {
        Challenge7MagicRemoteControl.run();
    }
}
 