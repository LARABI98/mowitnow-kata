package com.mowitnow.domain;

import java.util.Objects;

public class Coordinates {
    private final int x;
    private final int y;

    public Coordinates(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() { return x; }
    public int getY() { return y; }

    public Coordinates moveNorth() { return new Coordinates(x, y + 1); }
    public Coordinates moveEast()  { return new Coordinates(x + 1, y); }
    public Coordinates moveSouth() { return new Coordinates(x, y - 1); }
    public Coordinates moveWest()  { return new Coordinates(x - 1, y); }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Coordinates that = (Coordinates) o;
        return x == that.x && y == that.y;
    }

    @Override
    public int hashCode() { return Objects.hash(x, y); }
    
    @Override
    public String toString() { return x + " " + y; }
}