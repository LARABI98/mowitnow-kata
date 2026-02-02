package com.mowitnow;

import com.mowitnow.domain.Coordinates;
import com.mowitnow.domain.Direction;
import com.mowitnow.domain.Lawn;
import com.mowitnow.domain.Mower;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MowerTest {

    @Test
    void should_turn_left_correctly() {
        // Arrange
        Lawn lawn = new Lawn(5, 5);
        Mower mower = new Mower(new Coordinates(1, 2), Direction.N, lawn);

        // Act
        mower.turnLeft();

        // Assert
        Assertions.assertEquals("1 2 W", mower.toString());
    }

    @Test
    void should_move_forward_correctly() {
        // Arrange
        Lawn lawn = new Lawn(5, 5);
        Mower mower = new Mower(new Coordinates(1, 2), Direction.N, lawn);

        // Act
        mower.advance();

        // Assert
        Assertions.assertEquals("1 3 N", mower.toString());
    }

    @Test
    void should_not_move_outside_lawn_boundaries() {
        // Arrange: Tondeuse au bord Nord (5,5), orientée Nord
        Lawn lawn = new Lawn(5, 5);
        Mower mower = new Mower(new Coordinates(5, 5), Direction.N, lawn);

        // Act
        mower.advance();

        // Assert: Elle doit rester à 5 5
        Assertions.assertEquals("5 5 N", mower.toString());
    }
}