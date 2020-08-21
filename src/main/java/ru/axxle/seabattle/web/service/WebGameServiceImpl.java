package ru.axxle.seabattle.web.service;

import ma.glasnost.orika.MapperFacade;
import org.springframework.beans.factory.annotation.Autowired;
import ru.axxle.seabattle.service.GameService;
import ru.axxle.seabattle.web.WebGame;

public class WebGameServiceImpl implements WebGameService {

    private MapperFacade mapper;
    @Autowired
    private GameService gameService;

    @Override
    public WebGame createNewGame() {
        return mapper.map(gameService.createNewGame(), WebGame.class);
    }

    @Override
    public WebGame attachToGame(String gameId) {
        return null;
    }

    @Override
    public WebGame getById(String gameId) {
        return null;
    }

    @Override
    public WebGame makeMove(String gameId, String move) {
        return null;
    }

    @Override
    public WebGame leaveGame(String gameId) {
        return null;
    }
}
