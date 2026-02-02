package com.mowitnow;

import com.mowitnow.domain.*;
import com.mowitnow.instruction.InstructionFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MowerApplication {

    public List<String> runSimulation(String input) {
        List<String> results = new ArrayList<>();
        Scanner scanner = new Scanner(input);

        if (!scanner.hasNext()) return results;

        // 1. Lecture de la taille de la pelouse
        int limitX = scanner.nextInt();
        int limitY = scanner.nextInt();
        Lawn lawn = new Lawn(limitX, limitY);

        // 2. Boucle sur les tondeuses
        while (scanner.hasNext()) {
            // Position initiale (ex: 1 2 N)
            int startX = scanner.nextInt();
            int startY = scanner.nextInt();
            String dirCode = scanner.next();
            Direction direction = Direction.valueOf(dirCode);

            Mower mower = new Mower(new Coordinates(startX, startY), direction, lawn);

            // Instructions (ex: GAGAGAGAA)
            if (scanner.hasNext()) {
                String commands = scanner.next();
                executeInstructions(mower, commands);
            }
            
            results.add(mower.toString());
        }
        
        scanner.close();
        return results;
    }

    private void executeInstructions(Mower mower, String commands) {
        for (char c : commands.toCharArray()) {
            InstructionFactory.getInstruction(c).execute(mower);
        }
    }
}