package com.manj.lld.snakeladder.models;


import java.util.Random;

public class NormalDice extends Dice{

    private final Random roller;

    public NormalDice(int max){
        super(max);
        roller = new Random();
    }

    @Override
    public int roll(){
        int value = roller.nextInt(getMax()) + 1;
        //System.out.println("Rolled Normal dice for value : "+value);
        return value;
    }

}
