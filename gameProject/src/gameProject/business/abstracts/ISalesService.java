package gameProject.business.abstracts;

import gameProject.entities.concretes.Campaign;
import gameProject.entities.concretes.Game;
import gameProject.entities.concretes.User;

public interface ISalesService {
	
	void sale(Game game, User user);
	void saleWithCampaing(Game game, User user,Campaign campaign);

}
