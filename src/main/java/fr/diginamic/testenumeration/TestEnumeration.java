package fr.diginamic.testenumeration;

import java.util.ArrayList;
import java.util.Collections;

public class TestEnumeration {

	public static void main(String[] args) {
		
	//	Saison season = Saison.PRINTEMPS;
		
//		//création d'une arrayliste des saisons
//		ArrayList<Saison> listeSaisons = new ArrayList<>();
//		listeSaisons.add(Saison.PRINTEMPS);
//		listeSaisons.add(Saison.AUTOMNE);
//		listeSaisons.add(Saison.HIVER);
//		listeSaisons.add(Saison.ETE);
//		
//		
//		//tri en fonction du numéro associé
//		Collections.sort(listeSaisons);
//		System.out.println(listeSaisons);
		
		
		//boucle affichage des saisons
		Saison[] lesSaisons = Saison.values();
		for (Saison saison : lesSaisons) {
			System.out.println(saison);
		}
		
		//affichage d'une saison spé
		Saison saisonSpecifique = Saison.valueOf("PRINTEMPS");
		System.out.println(saisonSpecifique.getLibelle());
		
		//Afficher l'instance du libelle choisi
		String choix = "Hiver";
		Saison.getInstanceSaison(choix);
		
	}

}
