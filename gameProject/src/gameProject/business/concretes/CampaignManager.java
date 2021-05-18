package gameProject.business.concretes;

import gameProject.business.abstracts.ICampaignService;
import gameProject.entities.concretes.Campaign;

public class CampaignManager implements ICampaignService {

	@Override
	public void add(Campaign campaign) {
		
		System.out.println(campaign.getCampaignName() + " adlý kampanyayý eklediniz.");
	}

	@Override
	public void delete(Campaign campaign) {
		
		System.out.println(campaign.getCampaignName() + " adlý kampanyayý sildiniz.");
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println(campaign.getCampaignName() + " adlý kampanyayý güncellediniz.");
		
	}

}
