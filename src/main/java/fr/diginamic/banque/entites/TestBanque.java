package fr.diginamic.banque.entites;

public class TestBanque {

	public static void main(String[] args) {
		
		Compte cptBancaire = new Compte(2987575287261819L, 2756.76); 
		System.out.println("Numéro de compte: " + cptBancaire.numCompte);
		System.out.println("Solde du compte bancaire: " + cptBancaire.soldeCompte + "€.");
		
		}

}
