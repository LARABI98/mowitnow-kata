package com.mowitnow.instruction;
import com.mowitnow.domain.Mower;

public class TurnLeft implements Instruction {
    @Override
    public void execute(Mower mower) {
        mower.turnLeft();
    }
}