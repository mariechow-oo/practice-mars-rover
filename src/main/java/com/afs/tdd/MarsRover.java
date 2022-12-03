package com.afs.tdd;

public class MarsRover {
    private int locationX;
    private int locationY;
    private DirectionEnum direction;

    public MarsRover(int locationX, int locationY, String direction) {
        this.locationX = locationX;
        this.locationY = locationY;
        this.direction = DirectionEnum.valueOf(direction);
    }

    public void executeCommand(String command) {
        if (command.equals("M")) {
            move();
        }
        if (command.equals("L")) {
            rotateLeft();
        }
        if (command.equals("E")) {
            rotateRight();
        }
    }

    private void rotateLeft() {
        direction = direction.previous();
    }

    private void rotateRight() {
        direction = direction.next();
    }

    private void move() {
        if (direction == DirectionEnum.N) {
            locationY++;
        }
        if (direction == DirectionEnum.S) {
            locationY--;
        }
        if (direction == DirectionEnum.E) {
            locationX++;
        }
        if (direction == DirectionEnum.W) {
            locationX--;
        }
    }

    public int getLocationX() {
        return locationX;
    }

    public int getLocationY() {
        return locationY;
    }

    public String getDirectionString() {
        return direction.toString();
    }
}
