package ru.axxle.seabattle;

import ru.axxle.seabattle.web.WebGameArea;

public class Game {

	private String id;

	private String name;

	private WebGameArea area1;

	private WebGameArea area2;

	public Game(){
		this.area1 = new WebGameArea();
		this.area2 = new WebGameArea();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public WebGameArea getArea1() {
		return area1;
	}

	public void setArea1(WebGameArea area1) {
		this.area1 = area1;
	}

	public WebGameArea getArea2() {
		return area2;
	}

	public void setArea2(WebGameArea area2) {
		this.area2 = area2;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
}