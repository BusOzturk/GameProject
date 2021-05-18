package gameProject.adapter;

import gameProject.business.abstracts.IUserCheckService;
import gameProject.entities.concretes.User;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class UserCheckAdapter implements IUserCheckService{

	@Override
	public boolean checkIfRealUser(User user) {

		KPSPublicSoapProxy proxy = new KPSPublicSoapProxy();
		 boolean result = false;
		 try {
			 result = proxy.TCKimlikNoDogrula(Long.parseLong(user.getNationalityId()),user.getFirstName().toUpperCase(),user.getLastName().toUpperCase(),
						user.getDateOfBirth().getYear());
		 }
		 catch (Exception e) {
				System.out.println("Not a valid person");
			}
		 return result;
	}

}
