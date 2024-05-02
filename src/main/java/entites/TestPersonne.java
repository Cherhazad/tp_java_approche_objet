package entites;

public class TestPersonne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AdressePostale a1 = new AdressePostale();

		a1.numeroRue = 2;
		a1.libelleRue = "Rue Rivoli";
		a1.codePostal = 34000;
		a1.ville = "Montpellier";
		
		AdressePostale a2 = new AdressePostale();

		a2.numeroRue = 56;
		a2.libelleRue = "Rue des Sapins";
		a2.codePostal = 34000;
		a2.ville = "Montpellier";
		
		
		Personne p1 = new Personne();
		p1.nom = "blup";
		p1.prenom = "Sophie";
		p1.adresse = new AdressePostale();
		p1.adresse = a1; 
		
		Personne p2 = new Personne();
		p2.nom = "Tada";
		p2.prenom = "Juliette";
		p2.adresse = new AdressePostale();
		p2.adresse = a2; 

	}

}
