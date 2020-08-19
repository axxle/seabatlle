package ru.axxle.seabattle.dao;

import ru.axxle.seabattle.Game;

import java.util.HashMap;
import java.util.Map;

public class GameDaoImpl implements GameDao {

    private Map<String, Game> gameStorage = new HashMap();

    @Override
    public Game createNewGame() {
        Game game = new Game();
        game.setId("123");
        gameStorage.put(game.getId(), game);
        return game;
    }

    @Override
    public Game attachToGame(String gameId) {
        Game game = gameStorage.get(gameId);
        //setSecondPlayer
        return game;
    }

    @Override
    public Game getById(String gameId) {
        return gameStorage.get(gameId);
    }

    @Override
    public Game makeMove(String gameId, String move) {
        Game game = gameStorage.get(gameId);
        //makeMove
        return game;
    }

    @Override
    public Game leaveGame(String gameId) {
        Game game = gameStorage.get(gameId);
        //leaveGame
        return game;
    }
}
