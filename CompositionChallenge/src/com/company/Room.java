package com.company;

/*A room has:
    DIMENSIONS
        WIDTH
        LENGTH
        HEIGHT
    WALLS
        COLOR
        TEXTURE
    WINDOWS
        CAN OPEN, CLOSE
    DOOR
    BED
    TV SET
    CHAIR

*/

import java.util.concurrent.Future;

public class Room {
    private Door myDoor = new Door(new Dimensions(3,1,1), "white",
            "wood", false);
    private Wall fisrtWall = new Wall(new Dimensions(3, 1, 1),"Red",
            "plain");
    private Wall secondWall = new Wall(new Dimensions(3, 1, 1),"Red",
            "plain");
    private Wall thirdWall = new Wall(new Dimensions(3, 1, 1),"Red",
            "plain");
    private Wall fourthWall = new Wall(new Dimensions(3, 1, 1),"Red",
            "plain");
    private Window myWindow = new Window(new Dimensions(1, 1, 1),true);

    private Bed myBed = new Bed(new Dimensions(1,1,1),"white","wood");

    private TvSet myTvSet = new TvSet(new Dimensions(1,1,1),"black",
            "wood",false);




    public void turnTVOn() {
        getMyTvSet().turnTVSetOn();
    }


    public void turnTVOFF() {
        getMyTvSet().turnTVSetOff();
    }

    public void openDoor() {
        getMyDoor().openDoor();
    }

    public void closeDoor() {
        getMyDoor().closeDoor();;
    }

    public void openWindow() {
        getMyWindow().openWindow();
    }

    public void closeWindow() {
        getMyWindow().closingWindow();
    }

    private Door getMyDoor() {
        return myDoor;
    }

    private Window getMyWindow() {
        return myWindow;
    }

    private TvSet getMyTvSet() {
        return myTvSet;
    }
}
