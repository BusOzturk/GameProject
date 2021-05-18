package gameProject;

import java.time.LocalDate;

import gameProject.adapter.UserCheckAdapter;
import gameProject.business.concretes.CampaignManager;
import gameProject.business.concretes.GameManager;
import gameProject.business.concretes.SalesManager;
import gameProject.business.concretes.UserManager;
import gameProject.entities.concretes.Campaign;
import gameProject.entities.concretes.Game;
import gameProject.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		
		User user1 = new User();
		user1.setId(1);
		user1.setNationalityId("25838256290");
		user1.setFirstName("Büþra");
		user1.setLastName("Öztürk");
		user1.setUserName("mühendiskiz");
		user1.setDateOfBirth(LocalDate.of(1995, 11, 24));
		
		Game game1 = new Game();
		game1.setId(1);
		game1.setGameName("Age of Empires");
		game1.setPrice(150);
		game1.setType("Strateji oyunu");
		
		Game game2 = new Game();
		game2.setId(2);
		game2.setGameName("Counter Strike");
		game2.setPrice(200);
		game2.setType("Aksiyon oyunu");
		
		Campaign campaign1 = new Campaign();
		campaign1.setId(1);
		campaign1.setCampaignName("Kapanmaya özel kampanya");
		campaign1.setDiscount(50);
		
		UserManager userManager = new UserManager(new UserCheckAdapter());
		userManager.add(user1);
		
		GameManager gameManager = new GameManager();
		gameManager.add(game1);
		gameManager.add(game2);
		
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.add(campaign1);
		
		SalesManager salesManager = new SalesManager();
		salesManager.sale(game1, user1);
		salesManager.saleWithCampaing(game2, user1, campaign1);
		
	}

}
