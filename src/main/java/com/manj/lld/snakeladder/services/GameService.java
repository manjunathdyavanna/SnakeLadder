package com.manj.lld.snakeladder.services;

import com.manj.lld.snakeladder.models.Dice;
import com.manj.lld.snakeladder.models.Game;
import com.manj.lld.snakeladder.models.Player;
import com.manj.lld.snakeladder.models.enums.GameStatus;

import java.util.List;

public class GameService {
    public void startGame(Game game){
        game.setStatus(GameStatus.IN_PROGRESS);
        int nextIndex = 0;
        int playerCount = game.getPlayers().size();
        while (game.getPlayers().size() != 1) {
            Player player = game.getPlayers().get(nextIndex);
            System.out.println(player.getName()+" is playing");
            int nextValue = rollDice(game.getDices());

            int playersNextPos = player.getPosition() + nextValue;

            if (playersNextPos > 100) {
                playersNextPos = player.getPosition();
            } else if (game.getBoard().getSpecialCells().containsKey(playersNextPos)) {
                playersNextPos = game.getBoard().getSpecialCells().get(playersNextPos).getDestination();
                game.getPlayers().get(nextIndex).setPosition(playersNextPos);
            } else if (playersNextPos == 100) {
                System.out.println("player : " + game.getPlayers().get(nextIndex).getName()
                        + " won at the position : " + (playerCount - game.getPlayers().size() + 1));
                break;
                //game.getPlayers().remove(nextIndex);
            } else {
                int i = (playersNextPos - 1) / 10;
                int j = (playersNextPos - 1) % 10;
                game.getBoard().getCells().get(i).get(j).setPlayer(player);
                game.getPlayers().get(nextIndex).setPosition(playersNextPos);
            }
            System.out.println(player.getName()+"'s current position is "+player.getPosition());
            nextIndex++;
            if (nextIndex >= game.getPlayers().size()){
                nextIndex = nextIndex % game.getPlayers().size();
            }
        }

    }

    private int rollDice(List<Dice> dices) {
        int val = 0;
        for(int i=0; i<dices.size(); i++){
            val += dices.get(i).roll();
        }
        return val;
    }
}
