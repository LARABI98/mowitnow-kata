package com.mowitnow.domain;

public class Lawn {
    private final Coordinates topRightCorner;

    public Lawn(int width, int height) {
        this.topRightCorner = new Coordinates(width, height);
    }

    public boolean contains(Coordinates coordinates) {
        return coordinates.getX() >= 0 
            && coordinates.getX() <= topRightCorner.getX()
            && coordinates.getY() >= 0 
            && coordinates.getY() <= topRightCorner.getY();
    }
}