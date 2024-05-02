package entites;

public class TestPersonne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AdressePostale a1 = new AdressePostale(2, "Rue Rivoli", 34000, "Montpellier");
		
		AdressePostale a2 = new AdressePostale(56, "Rue des Sapins", 34000, "Montpellier");
		
		
		Personne p1 = new Personne("blup", "Sophie", a1);
		System.out.println(p1);
		
		
		Personne p2 = new Personne("Tada", "Juliette", a2);
		System.out.println(p2);
		

	}

}
