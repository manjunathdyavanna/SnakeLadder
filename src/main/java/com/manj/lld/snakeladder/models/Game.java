package com.manj.lld.snakeladder.models;

import com.manj.lld.snakeladder.models.enums.GameStatus;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Game {
    private Board board;
    private List<Dice> dices;
    private List<Player> players;
    private Player nextPlayer;
    private GameStatus status;
    private Player winner;
}
