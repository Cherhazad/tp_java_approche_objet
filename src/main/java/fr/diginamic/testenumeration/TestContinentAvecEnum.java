package fr.diginamic.testenumeration;

import java.util.ArrayList;




public class TestContinentAvecEnum {

	public static void main(String[] args) {
		ArrayList<Ville> villes = new ArrayList<>();
		villes.add(new Ville("Nice", 343000, Continent.EUROPE));
		villes.add(new Ville("Carcassonne", 47800, Continent.AFRIQUE));
		villes.add(new Ville("Narbonne", 53400, Continent.AMERIQUE));
		villes.add(new Ville("Lyon", 484000, Continent.OCEANIE));
		villes.add(new Ville("Foix", 9700, Continent.EUROPE));
		villes.add(new Ville("Pau", 77200, Continent.ASIE));
		villes.add(new Ville("Marseille", 850700, Continent.AFRIQUE));
		villes.add(new Ville("Tarbes", 40600, Continent.EUROPE));
		
		for (Ville v : villes) {
			System.out.println(v);
		}

	}

}
