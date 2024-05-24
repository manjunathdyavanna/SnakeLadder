package com.manj.lld.snakeladder.models;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.Map;

@Getter
public class Board {
    private List<List<Cell>> cells;
    private Map<Integer, SpecialCell> specialCells;

    private Board(){}

    public static Builder builder(){           //Builder pattern used to validate the board before creation
        return new Builder();
    }

    public static class Builder{
        private List<List<Cell>> cells;
        private Map<Integer, SpecialCell> specialCells;

        public Builder cells(List<List<Cell>> cells) {
            this.cells = cells;
            return this;
        }

        public Builder specialCells(Map<Integer, SpecialCell> specialCells) {
            this.specialCells = specialCells;
            return this;
        }

        public Board build(){
            Board b = new Board();
            b.cells = this.cells;
            b.specialCells = this.specialCells;
            return b;
        }
    }
}
