package fr.diginamic.essais;

import fr.diginamic.maison.Chambre;
import fr.diginamic.maison.Cuisine;
import fr.diginamic.maison.Maison;
import fr.diginamic.maison.SalleDeBain;
import fr.diginamic.maison.Salon;
import fr.diginamic.maison.WC;

public class TestMaison {

	public static void main(String[] args) {
		Maison maison1 = new Maison();
		
		Chambre chambre1 = new Chambre(12, 1);
		Cuisine cuisine1 = new Cuisine(18, 0);
		SalleDeBain sdb1 = new SalleDeBain(15, 1);
		Salon salon1 = new Salon(13, 0);
		WC wc1 = new WC(6,0);
		
		
		
		maison1.ajouterPiece(chambre1);
		maison1.ajouterPiece(cuisine1);
		maison1.ajouterPiece(sdb1);
		maison1.ajouterPiece(salon1);
		maison1.ajouterPiece(wc1);
				
		System.out.println("Maison1:" + maison1.toString() + ", sa superficie totale est de: " + maison1.getSuperficieTotale() + "m2.");
		System.out.println("Superficie du rez-de-chaussée " + maison1.getSuperficieEtage(0));
		
	}

}
