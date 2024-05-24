package com.manj.lld.snakeladder.models;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class Ladder extends SpecialCell{

    @Override
    public int getDestination(){
        return getEnd();
    }
}
