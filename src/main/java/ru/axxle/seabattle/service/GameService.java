package ru.axxle.seabattle.service;

import ru.axxle.seabattle.Game;

interface GameService {

    Game createNewGame();

    Game attachToGame(String gameId);

    Game getById(String gameId);

    Game makeMove(String gameId, String move);

    Game leaveGame(String gameId);
}
