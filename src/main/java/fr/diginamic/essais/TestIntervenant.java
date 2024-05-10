package fr.diginamic.essais;

import fr.diginamic.salaire.Pigiste;
import fr.diginamic.salaire.Salarie;

public class TestIntervenant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Salarie salarie1 = new Salarie("Feudar", "Tifice", 1856.53);
		Pigiste journaliste1 = new Pigiste("Journa", "Liste", 17, 24);
		
		System.out.println(salarie1.toString() + salarie1.getSalaire() + "€.");
		System.out.println(journaliste1.toString() + journaliste1.getJoursTravailles() + journaliste1.getSalaire() + "€.");

		System.out.println(salarie1.afficherDonnees());
		System.out.println(journaliste1.afficherDonnees());
		
	}

}
