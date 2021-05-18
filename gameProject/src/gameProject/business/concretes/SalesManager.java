package gameProject.business.concretes;

import gameProject.business.abstracts.ISalesService;
import gameProject.entities.concretes.Campaign;
import gameProject.entities.concretes.Game;
import gameProject.entities.concretes.User;

public class SalesManager implements ISalesService {

	@Override
	public void sale(Game game, User user) {
		System.out.println("Say�n" + " " + user.getUserName() + " " + game.getGameName() + "adl� oyunu sat�n ald�n�z.");
		
	}

	@Override
	public void saleWithCampaing(Game game, User user, Campaign campaign) {
		System.out.println("Say�n" + " " + user.getUserName() + " " + game.getGameName() + "adl� oyunu" + " " + campaign.getCampaignName() + "kampanyas�yla sat�n ald�n�z.");

		
	}

}
