package gameProject.business.concretes;

import gameProject.business.abstracts.ISalesService;
import gameProject.entities.concretes.Campaign;
import gameProject.entities.concretes.Game;
import gameProject.entities.concretes.User;

public class SalesManager implements ISalesService {

	@Override
	public void sale(Game game, User user) {
		System.out.println("Sayýn" + " " + user.getUserName() + " " + game.getGameName() + "adlý oyunu satýn aldýnýz.");
		
	}

	@Override
	public void saleWithCampaing(Game game, User user, Campaign campaign) {
		System.out.println("Sayýn" + " " + user.getUserName() + " " + game.getGameName() + "adlý oyunu" + " " + campaign.getCampaignName() + "kampanyasýyla satýn aldýnýz.");

		
	}

}
