package ru.axxle.seabattle.service;

import ru.axxle.seabattle.Game;
import ru.axxle.seabattle.dao.GameDao;
import ru.axxle.seabattle.dao.GameDaoImpl;

public class GameServiceImpl implements GameService {

    private GameDao dao;

    public GameServiceImpl() {
        this.dao = new GameDaoImpl();
    }

    @Override
    public Game createNewGame() {
        return dao.create(new Game());
    }

    @Override
    public Game attachToGame(String gameId) {
        return dao.getById(gameId);
    }

    @Override
    public Game getById(String gameId) {
        return dao.getById(gameId);
    }

    @Override
    public Game makeMove(String gameId, String move) {
        return dao.getById(gameId);
    }

    @Override
    public Game leaveGame(String gameId) {
        return dao.getById(gameId);
    }
}
