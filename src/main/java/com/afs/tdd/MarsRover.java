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

    public void executeBatchCommand(String batchCommand) {
        for (String command : batchCommand.split("")) {
            executeCommand(command);
        }
    }

    public void executeCommand(String command) {
        switch (command) {
            case "M":
                move();
                break;
            case "L":
                rotateLeft();
                break;
            case "R":
                rotateRight();
                break;
        }
    }

    private void rotateLeft() {
        direction = direction.previous();
    }

    private void rotateRight() {
        direction = direction.next();
    }

    private void move() {
        switch (direction) {
            case N:
                locationY++;
                break;
            case E:
                locationX++;
                break;
            case S:
                locationY--;
                break;
            case W:
                locationX--;
                break;
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
