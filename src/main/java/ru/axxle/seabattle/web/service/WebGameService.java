package ru.axxle.seabattle.web.service;

import ru.axxle.seabattle.web.WebGame;

public interface WebGameService {

    WebGame createNewGame();

    WebGame attachToGame(String gameId);

    WebGame getById(String gameId);

    WebGame makeMove(String gameId, String move);

    WebGame leaveGame(String gameId);
}
