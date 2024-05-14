package fr.diginamic.maps;

import java.util.HashMap;
import java.util.Iterator;

import listes.Ville;

public class mapVilles {

	public static void main(String[] args) {

		HashMap<String, Integer> mapVilles = new HashMap<String, Integer>();
		mapVilles.put("Nice", 343000);
		mapVilles.put("Carcasonne", 47800);
		mapVilles.put("Narbonne", 53400);
		mapVilles.put("Lyon", 484000);
		mapVilles.put("Foix", 9700);
		mapVilles.put("Pau", 77200);
		mapVilles.put("Marseille", 850700);
		mapVilles.put("Tarbes", 40600);

		Integer villeMin = mapVilles.get("Nice");
		String nomVilleMin = "";

		for (String nomVille : mapVilles.keySet()) {
			Integer villeCourante = mapVilles.get(nomVille);
			if (villeCourante < villeMin) {
				villeMin = villeCourante;
				nomVilleMin = nomVille;
			}
		}
		mapVilles.remove(nomVilleMin);

		System.out.println(nomVilleMin + " est la ville la moins peuplée et possède " + villeMin + " habitants.");
		System.out.println(mapVilles);
		
	}
}
