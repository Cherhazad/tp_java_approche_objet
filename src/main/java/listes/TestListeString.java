package listes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class TestListeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> villes = new ArrayList<String>();
		Collections.addAll(villes, "Nice", "Carcassonne", "Narbonne", "Lyon", "Foix", "Pau", "Marseille", "Tarbes");

		// recherche ville max lettres

		String maxVille = Collections.max(villes, Comparator.comparing(String::length));
		System.out.println(maxVille);
		
		//seconde façon avec une boucle CORRECTION
		String max = villes.get(0); //pour l'initialiser, on aurait pu mettre String max ="";
		for (int i = 0; i<villes.size(); i++) {
			String nom = villes.get(i);
			if (nom.length() > max.length()) {
				max =nom;
			}
		}
		System.out.println(max);
		
		// mettre en majuscule les villes
		for (int i=0 ; i < villes.size(); i++) {
		String majVille	= villes.get(i).toUpperCase();
		villes.set(i, majVille);
				
		}
		System.out.println(villes);
		
		
		// supprimer les éléments qui commencent par N
		
		Iterator<String> iter = villes.iterator();
		while (iter.hasNext()) {
			String nom = iter.next();
			if (nom.startsWith("N")) { //nom.charAt(0) == 'N'
				iter.remove();
			}
		}
		
		System.out.println("Villes sans première lettre = N: " + villes);
	}

}
