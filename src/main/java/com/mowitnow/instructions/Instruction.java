package com.mowitnow.instruction;

import com.mowitnow.domain.Mower;

@FunctionalInterface
public interface Instruction {
    void execute(Mower mower);
}