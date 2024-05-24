package com.manj.lld.snakeladder.models;

import com.manj.lld.snakeladder.models.enums.CellStatus;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class SpecialCell {

    private int start;
    private int end;

    abstract public int getDestination();
}
