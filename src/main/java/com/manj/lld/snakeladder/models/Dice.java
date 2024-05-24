package com.manj.lld.snakeladder.models;

import lombok.Getter;

@Getter
public abstract class Dice {
    private final int max;

    public Dice(int max){
        this.max = max;
    }

    abstract public int roll();
}
