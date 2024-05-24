package com.manj.lld.snakeladder.models;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Ladder extends SpecialCell{

    public Ladder(int start, int end) {
        super(start, end);
    }

    @Override
    public int getDestination(){
        System.out.println("inside Ladder");
        return getEnd();
    }
}
