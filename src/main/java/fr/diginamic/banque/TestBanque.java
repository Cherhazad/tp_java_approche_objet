package fr.diginamic.banque;

import fr.diginamic.banque.entites.Compte;
import fr.diginamic.banque.entites.CompteTaux;

public class TestBanque {

	public static void main(String[] args) {
		
		

		Compte cptBancaire1 = new Compte(2987575287261819L, 2756.76);
		System.out.println("Numéro de compte: " + cptBancaire1.numCompte);
		System.out.println("Solde du compte bancaire: " + cptBancaire1.soldeCompte + "€.");
		System.out.println(cptBancaire1);

		Compte cptBancaire2 = new CompteTaux(9187865987465829L, 42976.67, 3);
		System.out.println(cptBancaire2);

		Compte[] arrCompte = new Compte[2];
		arrCompte[0] = cptBancaire1;
		
		arrCompte[1] = cptBancaire2; // cause un bug, à cause de la classe CompteTaux manquante

		System.out.println(arrCompte[2]); //bug mais le [1] fonctionne

		for (int i = 0; i < 3; i++) {
			System.out.println(arrCompte[i]);
		}

	}

}
