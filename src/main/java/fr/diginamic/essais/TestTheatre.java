package fr.diginamic.essais;

import fr.diginamic.entites.Theatre;

public class TestTheatre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Theatre inscription = new Theatre("Le Théâtre du coin", 19, 0, 0);
		System.out.println(inscription);

		inscription.inscrire(3, 15);
		inscription.inscrire(3, 15);
		inscription.inscrire(3, 15);
		inscription.inscrire(3, 15);
		inscription.inscrire(3, 15);
		inscription.inscrire(3, 15);
		inscription.inscrire(3, 15);
		
		System.out.println(inscription);

		

	}

}
