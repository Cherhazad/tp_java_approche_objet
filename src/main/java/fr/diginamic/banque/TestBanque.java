package fr.diginamic.banque;

import fr.diginamic.banque.entites.Compte;
import fr.diginamic.banque.entites.CompteTaux;

public class TestBanque {

	public static void main(String[] args) {

		Compte cptBancaire1 = new Compte(2987575287261819L, 2756.76);
		// System.out.println("Numéro de compte: " + cptBancaire1.numCompte);
		// System.out.println("Solde du compte bancaire: " + cptBancaire1.soldeCompte +
		// "€.");
		// System.out.println(cptBancaire1);

		CompteTaux cptBancaire2 = new CompteTaux(9187865987465829L, 42976.67, 3);
		// System.out.println(cptBancaire2);

		Compte[] arrCompte = { cptBancaire1, cptBancaire2 }; 
		// 2nde façon de faire
		// Compte[] compte = new Compte[2];
		//comptes[0] = cptBancaire1;
		//comptes[1] = cptBancaire2;
		
		
		for (int i = 0; i < arrCompte.length; i++) {
			System.out.println("Compte n° " + i +": "+ arrCompte[i]);
		}

	}

}
