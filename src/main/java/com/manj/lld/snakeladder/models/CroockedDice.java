package com.manj.lld.snakeladder.models;


import java.util.Random;

public class CroockedDice extends Dice{

    private final Random roller;

    public CroockedDice(int max){
        super(max);
        roller = new Random();
    }

    @Override
    public int roll(){
        int value = roller.nextInt(getMax()) + 1;
        System.out.println("Rolled croocked dice for value : "+value);
        if(value%2 == 0)
            return value;
        else
            return value+1;
    }

}
