package fr.diginamic.banque.entites;

public abstract class Operation {

	protected String date;
	protected double montant;
	protected double solde;

	public Operation(String date, double montant) {
		this.date = date;
		this.montant = montant;
	}

	
	public abstract String getType();
	
	public abstract double calculerTotal(double total);

	@Override
	public String toString() {
		return date + " " + montant + " type = " + getType();
	}
	
	public double getMontant() {
		return solde;
	}
}
