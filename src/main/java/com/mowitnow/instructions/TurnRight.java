package com.mowitnow.instruction;
import com.mowitnow.domain.Mower;

public class TurnRight implements Instruction {
    @Override
    public void execute(Mower mower) {
        mower.turnRight();
    }
}