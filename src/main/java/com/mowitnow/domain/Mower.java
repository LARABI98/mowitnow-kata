package com.mowitnow.domain;

public class Mower {
    private Coordinates coordinates;
    private Direction direction;
    private final Lawn lawn;

    public Mower(Coordinates startCoordinates, Direction startDirection, Lawn lawn) {
        this.coordinates = startCoordinates;
        this.direction = startDirection;
        this.lawn = lawn;
    }

    public void turnLeft() {
        this.direction = this.direction.turnLeft();
    }

    public void turnRight() {
        this.direction = this.direction.turnRight();
    }

    public void advance() {
        Coordinates newCoordinates = switch (this.direction) {
            case N -> this.coordinates.moveNorth();
            case E -> this.coordinates.moveEast();
            case S -> this.coordinates.moveSouth();
            case W -> this.coordinates.moveWest();
        };

        if (lawn.contains(newCoordinates)) {
            this.coordinates = newCoordinates;
        }
        
    }

    @Override
    public String toString() {
        return coordinates.toString() + " " + direction;
    }
}
