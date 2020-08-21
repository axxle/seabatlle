package ru.axxle.seabattle.dao;

import ru.axxle.seabattle.Game;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GameDaoImpl implements GameDao {

    private Map<String, Game> gameStorage = new HashMap();
    private volatile int counter = 0;

    @Override
    public Game create(Game game) {
        game.setId(++counter + "");
        gameStorage.put(game.getId(), game);
        return gameStorage.get(game.getId());
    }

    @Override
    public List<Game> getAll() {
        return null;
    }

    @Override
    public Game getById(String gameId) {
        return gameStorage.get(gameId);
    }

    @Override
    public Game save(Game game) {
        gameStorage.put(game.getId(), game);
        return gameStorage.get(game.getId());
    }
}
