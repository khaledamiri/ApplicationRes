import java.rmi.Naming;

import org.banque.amiri.entities.Compte;
import org.banque.amiri.rmi.BanqueRMIRemote;

public class ClientRMI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			BanqueRMIRemote proxy = (BanqueRMIRemote) Naming
					.lookup("rmi://localhost:1099/BK");
			
			Compte cp=proxy.getCompte("CC1");
			System.out.println(cp.getSolde());
			System.out.println(cp.getDateCreation());
			System.out.println(cp.getClient().getNomClient());
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
