package fr.diginamic.maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class ComptagePaysParContinent {

	public static void main(String[] args) {

		ArrayList<Pays> pays = new ArrayList<>();
		pays.add(new Pays("France", 65000000, "Europe"));
		pays.add(new Pays("Allemagne", 80000000, "Europe"));
		pays.add(new Pays("Belgique", 10000000, "Europe"));
		pays.add(new Pays("Russie", 150000000, "Asie"));
		pays.add(new Pays("Chine", 1400000000, "Asie"));
		pays.add(new Pays("Indonésie", 220000000, "Océanie"));
		pays.add(new Pays("Australie", 20000000, "Océanie"));

		System.out.println(pays);

		// méthode avec boucle for non indexée
		HashMap<String, Integer> mapPays = new HashMap<>();
		int i = 0;
		Pays firstFor = pays.get(0);
		for (Pays listPays : pays) {
			if (listPays.getNomContinent().equals(firstFor.getNomContinent())) {
				mapPays.put(firstFor.getNomContinent(), i = i + 1);
			} else {
				i = 1;
			}
			firstFor = listPays;
		}
		System.out.println(mapPays);

		// méthode avec iterator

//		HashMap<String, Integer> mapPays = new HashMap<>();
//
//		Iterator<Pays> p = pays.iterator();
//		int i = 0;
//		Pays first = pays.get(0);
//		while (p.hasNext()) {
//			Pays newPays = p.next();
//			if (newPays.getNomContinent().equals(first.getNomContinent())) {
//				mapPays.put(first.getNomContinent(), i = i + 1);
//			} else {
//				i = 1;
//			}
//			first = newPays;
//
//		}
//		System.out.println(mapPays);

	}

}
