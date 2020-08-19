package ru.axxle.seabattle.dao;

import ru.axxle.seabattle.Game;

public interface GameDao {

    Game createNewGame();

    Game attachToGame(String gameId);

    Game getById(String gameId);

    Game makeMove(String gameId, String move);

    Game leaveGame(String gameId);
}
