package fr.diginamic.chaines;

import java.util.Arrays;

import fr.diginamic.entites.Salarie;

public class ManipulationChaine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String chaine = "Durand;Marcel;2 523.5";
		
		//1. méthode charAt(int index)

		char premierCaractere = chaine.charAt(0);
		System.out.println("Premier caractère: " + premierCaractere);
		
		//2. méthode length()

		int longueurCaracteres = chaine.length();
		System.out.println("Longueur chaine de caractères: " + longueurCaracteres);

		
		//3. méthode indexOf(char c)
		char c = ';';
		int rechercheIndex = chaine.indexOf(c);
		System.out.println("Index de ce premier caractère " + " \"" + c + "\": " + " " + rechercheIndex);

		
		//4. méthode substring(int start, int end)
		
		String extraction = chaine.substring(0, chaine.indexOf(c));
		System.out.println("extraction: " + extraction);
		
		
		//5. méthode toUpperCase()
		String nomMaj = chaine.toUpperCase().substring(0, chaine.indexOf(c));
		System.out.println("Uppercase: " + nomMaj);
		
		//6. méthode toLowerCase()

		String nomMin = chaine.toLowerCase().substring(0, chaine.indexOf(c));
		System.out.println("Lowercase: " + nomMin);
		
		//9.a. méthode replace() pour retrait espace
		String chaineDbl = chaine.replace(" ", "");
		System.out.println("Retrait espace: " + chaineDbl);
		
		//7. méthode split
		String[] separate = chaineDbl.split(";");
		System.out.println(Arrays.toString(separate));
			
		//9.b. conversion String en double
		double salaire = Double.parseDouble(separate[2]);
		//System.out.println("salaire " + salaire);
		
		
		//9. Création d'instance de salarié
		Salarie num1 = new Salarie(separate[0], separate[1], salaire);
		System.out.println(num1.nom + " " + num1.prenom + " " + num1.salaire);

	}

}
