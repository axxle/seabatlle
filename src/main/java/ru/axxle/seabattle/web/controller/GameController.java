package ru.axxle.seabattle.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import ru.axxle.seabattle.web.WebGame;
import ru.axxle.seabattle.web.service.WebGameService;


@RestController
@RequestMapping(value = GameController.REQUEST_PATH)
public class GameController {
	public static final String BY_ID = "/{id:.+}";
	public static final String REQUEST_PATH = "/game";

	@Autowired
	private WebGameService webGameService;

	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<WebGame> createNewGame() {
		WebGame newGame = webGameService.createNewGame();
		newGame.setName("createNewGame()");
		return new ResponseEntity<WebGame>(newGame, HttpStatus.OK);
	}

	@RequestMapping(value = BY_ID + "/attach", method = RequestMethod.POST)
	public ResponseEntity<WebGame> attachToGame(@PathVariable String id) {
		WebGame game = new WebGame();
		game.setName("attachToGame(" + id + ")");
		return new ResponseEntity<WebGame>(game, HttpStatus.OK);
	}

	@RequestMapping(value = BY_ID, method = RequestMethod.GET)
	public ResponseEntity<WebGame> getById(@PathVariable String id) {
		WebGame game = new WebGame();
		game.setName("getById(" + id + ")");
		return new ResponseEntity<WebGame>(game, HttpStatus.OK);
	}

	@RequestMapping(value = BY_ID + "/move", method = RequestMethod.POST)
	public ResponseEntity<WebGame> makeMove(@PathVariable String id) {
		WebGame game = new WebGame();
		game.setName("move(" + id + ")");
		return new ResponseEntity<WebGame>(game, HttpStatus.OK);
	}

	@RequestMapping(value = BY_ID + "/leave", method = RequestMethod.POST)
	public ResponseEntity<WebGame> leaveGame(@PathVariable String id) {
		WebGame game = new WebGame();
		game.setName("leaveGame(" + id + ")");
		return new ResponseEntity<WebGame>(game, HttpStatus.OK);
	}
}