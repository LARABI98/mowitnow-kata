package com.mowitnow.instruction;

import java.util.HashMap;
import java.util.Map;

public class InstructionFactory {
    
    private static final Map<Character, Instruction> instructionMap = new HashMap<>();

    static {
        instructionMap.put('G', new TurnLeft());
        instructionMap.put('D', new TurnRight());
        instructionMap.put('A', new Advance());
    }

    public static Instruction getInstruction(char code) {
        if (!instructionMap.containsKey(code)) {
            throw new IllegalArgumentException("Instruction inconnue : " + code);
        }
        return instructionMap.get(code);
    }
}
