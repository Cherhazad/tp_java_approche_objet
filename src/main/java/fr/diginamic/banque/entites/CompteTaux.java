package fr.diginamic.banque.entites;

public class CompteTaux extends Compte {
	
	private double tauxConv;

	public CompteTaux(long numCompte, double soldeCompte, double tauxConv) {
		super(numCompte, soldeCompte);
		this.tauxConv = tauxConv;

	}
	
	
	public double getTauxConv() {
		return tauxConv;
	}



	public void setTauxConv(double tauxConv) {
		this.tauxConv = tauxConv;
	}



	@Override
	public String toString(){
		
	    return super.toString() + " " + tauxConv;
	  }

}
