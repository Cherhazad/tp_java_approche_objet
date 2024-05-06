package fr.diginamic.essais;

import fr.diginamic.entites.Cercle;

public class TestCercle {

	public static void main(String[] args) {
	
		Cercle cercle1 = new Cercle(3);
		Cercle cercle2 = new Cercle(4.5);
		
		System.out.println("Avec un rayon de " + cercle1.getRayon() + " Le périmètre est de: " + cercle1.perimetre());
		System.out.println("Avec un rayon de " + cercle1.getRayon() + " La surface est de: " + cercle1.surface());
		
		System.out.println("Avec un rayon de " + cercle2.getRayon() + " Le périmètre est de: " + cercle2.perimetre());
		System.out.println("Avec un rayon de " + cercle2.getRayon() + " La surface est de: " + cercle2.surface());
	
	}
}
