package gameProject.business.concretes;

import gameProject.business.abstracts.IGameService;
import gameProject.entities.concretes.Game;

public class GameManager implements IGameService{

	@Override
	public void add(Game game) {
		System.out.println(game.getGameName() + "adlý oyunu eklediniz.");
		
	}

	@Override
	public void delete(Game game) {
		System.out.println(game.getGameName() + "adlý oyunu sildiniz.");
		
	}

	@Override
	public void update(Game game) {
		System.out.println(game.getGameName() + "adlý oyunu güncellendi.");
		
	}

}
