package fr.diginamic.essais;

import fr.diginamic.formes.Forme;

public class AffichageForme {

	Forme forme;

	public static void afficher(Forme forme) {
		System.out.println("La surface du " + forme.toString() + "est de: " + forme.calculerSurface()); 
		System.out.println("Le périmètre du " + forme.toString() + "est de: " + forme.calculerPerimetre()); 

	}

}