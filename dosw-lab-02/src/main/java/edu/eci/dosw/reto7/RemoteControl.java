package edu.eci.dosw.reto7;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Class that acts as the invoker in the command pattern
 */

public class RemoteControl{
    private List<History> allHistory = new ArrayList<>();
    private Command currentCommand;
    private Scanner read = new Scanner(System.in);

    public void setCommand(Command c){
        this.currentCommand = c;
    }

    public void executeCommand(Command c){
        this.currentCommand = c;
        c.execute();
        System.out.println("Please write your name");
        String userName = read.nextLine();
        if (userName.isBlank())
            userName = "ADMIN";
        allHistory.add(new History(userName, false, c));
    }

    public void undoCommand(){
        if (allHistory.isEmpty())
            System.out.println("There is no action to be undone");

        History lastAction = allHistory.get(allHistory.size() - 1);
        Command action = lastAction.getCommand();
        action.execute();
    }

    public void showHistory(){
        System.out.println("This is all your actions performed");

        for (History h : allHistory) {
            System.out.println("ID: " + h.getActionTime() + " | Device: " + h.getCommand().getDeviceInvolved() + " | Action:" + 
            h.getCommand().getName() + " | User:" +h.getUser() + " | Undone=" + h.getUndone());
        }
    }

}