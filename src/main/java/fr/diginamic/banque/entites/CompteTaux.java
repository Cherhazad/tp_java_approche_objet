package fr.diginamic.banque.entites;

public class CompteTaux extends Compte {
	
	public int tauxConv;

	public CompteTaux(long numCompte, double soldeCompte, int tauxConv) {
		super(numCompte, soldeCompte);
		this.tauxConv = tauxConv;

	}
	
	@Override
	public String toString(){
		
	    return super.toString() + " " + tauxConv;
	  }

}
