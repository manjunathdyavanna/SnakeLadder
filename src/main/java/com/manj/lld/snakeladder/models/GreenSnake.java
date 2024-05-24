package com.manj.lld.snakeladder.models;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class GreenSnake extends SpecialCell{

    private boolean active;

    private void setActive(boolean active){}

    @Override
    public int getDestination(){
        if(!active){
            return getStart();
        }
        return getEnd();
    }
}
