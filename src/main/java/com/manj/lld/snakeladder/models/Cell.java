package com.manj.lld.snakeladder.models;

import com.manj.lld.snakeladder.models.enums.CellStatus;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class Cell {
    private int row;
    private int col;
    private int value;
    private CellStatus status;
    private Player player;
}
