package gameProject.business.concretes;

import gameProject.business.abstracts.IGameService;
import gameProject.entities.concretes.Game;

public class GameManager implements IGameService{

	@Override
	public void add(Game game) {
		System.out.println(game.getGameName() + "adl� oyunu eklediniz.");
		
	}

	@Override
	public void delete(Game game) {
		System.out.println(game.getGameName() + "adl� oyunu sildiniz.");
		
	}

	@Override
	public void update(Game game) {
		System.out.println(game.getGameName() + "adl� oyunu g�ncellendi.");
		
	}

}
