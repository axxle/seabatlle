package ru.axxle.seabattle.web;

public class WebGame {

	private String name;

	private GameArea area1;

	private GameArea area2;

	public WebGame(){
		this.area1 = new GameArea();
		this.area2 = new GameArea();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public GameArea getArea1() {
		return area1;
	}

	public void setArea1(GameArea area1) {
		this.area1 = area1;
	}

	public GameArea getArea2() {
		return area2;
	}

	public void setArea2(GameArea area2) {
		this.area2 = area2;
	}
}