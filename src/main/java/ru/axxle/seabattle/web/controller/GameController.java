package ru.axxle.seabattle.web.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.annotation.*;
import ru.axxle.seabattle.web.WebGame;


@RestController
@RequestMapping(value = GameController.REQUEST_PATH)
public class GameController {
	public static final String BY_ID = "/{id:.+}";
	public static final String REQUEST_PATH = "/game";

	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<WebGame> createNewGame() {
		WebGame newGame = new WebGame();
		newGame.setName("createNewGame()");
		return new ResponseEntity<WebGame>(newGame, HttpStatus.OK);
	}

	//ATTACH_TO_GAME	POST /game/{id:.+}/attach
	@RequestMapping(value = BY_ID + "/attach", method = RequestMethod.GET)
	public ResponseEntity<Object> attachToGame(@PathVariable String id) {
		return new ResponseEntity<Object>("attachToGame(" + id + ")", HttpStatus.OK);
	}

	//MOVE				POST /game/{id:.+}/move
	@RequestMapping(value = BY_ID + "/move", method = RequestMethod.GET)
	public ResponseEntity<Object> move(@PathVariable String id) {
		return new ResponseEntity<Object>("move(" + id + ")", HttpStatus.OK);
	}

	//GET_BY_ID			GET /game/{id:.+}
	@RequestMapping(value = BY_ID, method = RequestMethod.GET)
	public ResponseEntity<Object> getById(@PathVariable String id) {
		return new ResponseEntity<Object>("getById(" + id + ");", HttpStatus.OK);
	}

	//LEAVE_GAME		POST /game/{id:.+}/leave
	@RequestMapping(value = BY_ID + "/leave", method = RequestMethod.GET)
	public ResponseEntity<Object> leaveGame(@PathVariable String id) {
		return new ResponseEntity<Object>("leaveGame(" + id + ")", HttpStatus.OK);
	}
}