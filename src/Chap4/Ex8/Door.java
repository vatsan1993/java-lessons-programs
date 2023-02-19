package Chap4.Ex8;

public class Door {
    private boolean isClosed =true;
    private boolean isLocked= false;
    private int passkey= 3421;
    private int doorAngle= 0;

    public void closeDoor(){
        isClosed= true;
        doorAngle= 0;
        System.out.println("Door is closed.");
    }
    public void openDoor(int location){
        // location can be from 1 to 6;
        if(location>=1 && location<=6){
            if(isClosed && !isLocked){
                isClosed= false;
                doorAngle= location*15;
                System.out.println("Door opened at "+ doorAngle+ " degrees");

            }
            else{
                System.out.println("Cannot open the door");
            }
        }
        else{
            System.out.println("Cannot open the door with the specified angle. Use only 1 to 6");
        }
    }

    public void lockDoor(int password){
        if(password== passkey){
            isLocked= true;
            isClosed= true;
            System.out.println("Door is locked");
        }
        else{
            System.out.println("Unable to lock");
        }
    }
    public void unlockDoor(int password){
        if(password== passkey){
            isLocked= false;
            System.out.println("Door is unlocked");
        }
        else{
            System.out.println("Unable to unlock");
        }
    }
}
