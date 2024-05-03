package fr.diginamic.banque.entites;

public class Debit extends Operation {

	//private String type = "DEBIT";
	
	public Debit(String date, double montant) {
		super(date, montant);
		
		// TODO Auto-generated constructor stub
	}
	
	public String getType() {
		return "DEBIT";
	}
	
	public double calculerTotal(double total) {
		return total-getMontant();
	}
	
	//@Override
	//public double getMontant() {
	//	return solde -= montant;
	//}
	
}
