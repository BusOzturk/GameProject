package gameProject.business.concretes;

import gameProject.business.abstracts.IUserCheckService;
import gameProject.business.abstracts.IUserService;
import gameProject.entities.concretes.User;

public class UserManager implements IUserService{
	
	IUserCheckService userCheckService;

	public UserManager(IUserCheckService userCheckService) {
		
		this.userCheckService = userCheckService;
	}

	@Override
	public void add(User user) {
		if (userCheckService.checkIfRealUser(user)) {
			System.out.println(user.getUserName() + "adl� kullan�c� eklendi.");
		}else {
			System.out.println("Hatal� kullan�c� bilgileri");
		}
			
		
	}

	@Override
	public void delete(User user) {
		if (userCheckService.checkIfRealUser(user)) {
			System.out.println(user.getUserName() + "adl� kullan�c� silindi.");
		}else {
			System.out.println("Hatal� kullan�c� bilgileri");
		}
		
	}

	@Override
	public void update(User user) {
		if (userCheckService.checkIfRealUser(user)) {
			System.out.println(user.getUserName() + "adl� kullan�c� g�ncellendi.");
		}else {
			System.out.println("Hatal� kullan�c� bilgileri");
		}
		
	}

}
