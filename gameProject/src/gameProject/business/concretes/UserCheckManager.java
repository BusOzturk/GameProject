package gameProject.business.concretes;

import gameProject.business.abstracts.IUserCheckService;
import gameProject.entities.concretes.User;

public class UserCheckManager implements IUserCheckService {

	@Override
	public boolean checkIfRealUser(User user) {
		return true;
	}


}
