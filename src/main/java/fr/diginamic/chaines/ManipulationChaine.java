package fr.diginamic.chaines;

import java.util.Arrays;

import fr.diginamic.entites.Salarie;

public class ManipulationChaine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String chaine = "Durand;Marcel;2 523.5";

		char premierCaractere = chaine.charAt(0);
		System.out.println("Premier caractère: " + premierCaractere);

		int longueurCaracteres = chaine.length();
		System.out.println("Longueur chaine de caractères: " + longueurCaracteres);

		char c = ';';
		int rechercheIndex = chaine.indexOf(c);
		System.out.println("Index de ce premier caractère " + " \"" + c + "\": " + " " + rechercheIndex);

		String nomMaj = chaine.toUpperCase().substring(0, 6);
		System.out.println(nomMaj);

		String nomMin = chaine.toLowerCase().substring(0, 6);
		System.out.println(nomMin);

		String[] separate = chaine.split(";");
		System.out.println(Arrays.toString(separate));
		
		double salaireDbl = Double.parseDouble(separate[2]);
		
		Salarie num1 = new Salarie();
		num1.ajoutSalarie(separate);
		System.out.println(num1.nom + " " + num1.prenom);

	}

}
