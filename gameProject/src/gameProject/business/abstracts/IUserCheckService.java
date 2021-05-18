package gameProject.business.abstracts;
import gameProject.entities.concretes.User;

public interface IUserCheckService {
	
	boolean checkIfRealUser(User user );

	
}
