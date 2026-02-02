package com.mowitnow;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.List;

class IntegrationTest {

    @Test
    void should_solve_the_challenge_scenario() {
        // Arrange
        String input = """
                5 5
                1 2 N
                GAGAGAGAA
                3 3 E
                AADAADADDA
                """;
        MowerApplication app = new MowerApplication();

        // Act
        List<String> results = app.runSimulation(input);

        // Assert
        Assertions.assertEquals(2, results.size());
        Assertions.assertEquals("1 3 N", results.get(0));
        Assertions.assertEquals("5 1 E", results.get(1));
    }
}