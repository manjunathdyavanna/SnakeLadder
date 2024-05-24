package com.manj.lld.snakeladder.models;

import com.manj.lld.snakeladder.models.enums.GameStatus;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Builder
@Getter
@Setter
public class Game {
    private Board board;
    private List<Dice> dices;
    private List<Player> players;
    private int nextPlayerIndex;
    private GameStatus status;
    private Player winner;
}
