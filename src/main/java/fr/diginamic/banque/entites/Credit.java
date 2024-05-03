package fr.diginamic.banque.entites;

public class Credit extends Operation {

	// private String type = "CREDIT";

	public Credit(String date, double montant) {
		super(date, montant);

		// TODO Auto-generated constructor stub
	}

	public String getType() {
		return "CREDIT";
	}
	
	public double calculerTotal(double total) {
		return total+getMontant();
	}
	
	//@Override
	//public double getMontant() {
	//	return solde += montant;
	//}


}
