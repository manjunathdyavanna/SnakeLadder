package com.manj.lld.snakeladder.models;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GreenSnake extends SpecialCell{

    private boolean active;

    public GreenSnake(int start, int end, boolean active) {
        super(start, end);
        this.active = active;
    }

    private void setActive(boolean active){}

    @Override
    public int getDestination(){
        System.out.println("inside Green snake");
        if(!active){
            return getStart();
        }
        active = false;
        return getEnd();
    }
}
