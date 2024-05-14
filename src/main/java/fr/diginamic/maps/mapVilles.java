package fr.diginamic.maps;

import java.util.HashMap;
import java.util.Iterator;

import listes.Ville;

public class mapVilles {

	public static void main(String[] args) {

		HashMap<String, Integer> mapVilles = new HashMap<String, Integer>();
		mapVilles.put("Nice", 343000);
		mapVilles.put("Carcasonne",47800);
		mapVilles.put("Naarbonne",53400);
		mapVilles.put("Lyon", 484000);
		mapVilles.put("Foix", 9700);
		mapVilles.put("Pau", 77200);
		mapVilles.put("Marseille", 850700);
		mapVilles.put("Tarbes", 40600);
		
		Iterator<Integer> valuesIte = mapVilles.values().iterator();
		while (valuesIte.hasNext()) {
			Integer valuesMin = valuesIte.next();
			//if (valuesMin < 
		
			
		}
	}

}
