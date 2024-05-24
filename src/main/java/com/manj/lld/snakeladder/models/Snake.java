package com.manj.lld.snakeladder.models;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Snake extends SpecialCell{

    public Snake(int start, int end){
        super(start, end);
    }
    @Override
    public int getDestination(){
        System.out.println("inside snake");
        return getEnd();
    }
}
