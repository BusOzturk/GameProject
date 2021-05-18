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
			System.out.println(user.getUserName() + "adlý kullanýcý eklendi.");
		}else {
			System.out.println("Hatalý kullanýcý bilgileri");
		}
			
		
	}

	@Override
	public void delete(User user) {
		if (userCheckService.checkIfRealUser(user)) {
			System.out.println(user.getUserName() + "adlý kullanýcý silindi.");
		}else {
			System.out.println("Hatalý kullanýcý bilgileri");
		}
		
	}

	@Override
	public void update(User user) {
		if (userCheckService.checkIfRealUser(user)) {
			System.out.println(user.getUserName() + "adlý kullanýcý güncellendi.");
		}else {
			System.out.println("Hatalý kullanýcý bilgileri");
		}
		
	}

}
