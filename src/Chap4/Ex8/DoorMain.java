package Chap4.Ex8;

public class DoorMain {
    public static void main(String[] args) {
        Door d1= new Door();


        d1.closeDoor();
        d1.openDoor(3);
        d1.lockDoor(123);
        d1.lockDoor(3421);
        d1.unlockDoor(123);
        d1.unlockDoor(3421);

        d1.openDoor(10);
        d1.openDoor(6);
    }
}
