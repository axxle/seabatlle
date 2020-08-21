package ru.axxle.seabattle.dao;

import ru.axxle.seabattle.Game;

import java.util.List;

public interface GameDao {

    Game create(Game game);

    List<Game> getAll();

    Game getById(String gameId);

    Game save(Game game);

}
