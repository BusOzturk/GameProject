package gameProject.entities.concretes;

import gameProject.entities.abstracts.IEntity;

public class Game implements IEntity{
	
	private int id;
	private String gameName;
	private String type;
	private double price;
	
	public Game() {
		
	}
	
	public Game(int id, String gameName, String type, double price) {
		super();
		this.id = id;
		this.gameName = gameName;
		this.type = type;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getGameName() {
		return gameName;
	}

	public void setGameName(String gameName) {
		this.gameName = gameName;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	

}
