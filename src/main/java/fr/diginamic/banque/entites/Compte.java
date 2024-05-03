package fr.diginamic.banque.entites;

public class Compte {

	private long numCompte;
	private double soldeCompte;

	public Compte(long numCompte, double soldeCompte) {
		this.numCompte = numCompte;
		this.soldeCompte = soldeCompte;

	}
	
	
	
	public long getNumCompte() {
		return numCompte;
	}


	public double getSoldeCompte() {
		return soldeCompte;
	}



	public void setSoldeCompte(double soldeCompte) {
		this.soldeCompte = soldeCompte;
	}



	public String toString(){
	    return numCompte + " " + soldeCompte;
	  }

}
