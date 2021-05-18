package gameProject.business.abstracts;

import gameProject.entities.concretes.User;

public interface IUserService {
	void add(User user);
	void delete (User user);
	void update(User user);

}
