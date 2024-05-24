package com.manj.lld.snakeladder;

import com.manj.lld.snakeladder.models.*;
import com.manj.lld.snakeladder.models.enums.CellStatus;
import com.manj.lld.snakeladder.models.enums.GameStatus;
import com.manj.lld.snakeladder.services.GameService;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<List<Cell>> cells = new ArrayList<>();
        for(int i=0; i<10; i++){
            cells.add(new ArrayList<>());
            for(int j=0; j<10; j++){
                cells.get(i).add(Cell.builder()
                        .row(i)
                        .col(j)
                        .value((i*10)+j+1)
                        .status(CellStatus.ACTIVE).build());
            }
        }

        Map<Integer, SpecialCell> specialCells = new HashMap<>();
        specialCells.put(24,new Snake(24, 19));
        specialCells.put(30,new Snake(30, 18));
        specialCells.put(42,new Ladder(42, 87));
        specialCells.put(88,new GreenSnake(88, 34, Boolean.TRUE));

        Board b = Board.builder()
                .cells(cells)
                .specialCells(specialCells)
                .build();

        List<Dice> dices = new ArrayList<>();
        dices.add(new NormalDice(6));
        //dices.add(new CroockedDice(6));

        List<Player> players = new ArrayList<>();
        players.add(Player.builder().name("manju").sign('a').position(0).build());
        players.add(Player.builder().name("sakshi").sign('b').position(0).build());
        players.add(Player.builder().name("sinha").sign('c').position(0).build());

        Collections.shuffle(players);

        Game game = Game.builder()
                .board(b)
                .dices(dices)
                .players(players).status(GameStatus.PAUSED)
                .nextPlayerIndex(0).build();
        GameService service = new GameService();
        service.startGame(game);



    }
}