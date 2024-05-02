package entites;

public class TestPersonne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AdressePostale a1 = new AdressePostale(2, "Rue Rivoli", 34000, "Montpellier");
		
		AdressePostale a2 = new AdressePostale(56, "Rue des Sapins", 34000, "Montpellier");
		
		
		Personne p1 = new Personne("blup", "Sophie", a1);
		
		
		
		Personne p2 = new Personne("Tada", "Juliette", a2);
		
		
		Personne p3 = new Personne("Tada", "Juliette", new AdressePostale(3, "Av de Paris", 34000, "Montpellier"));
		
		
		p1.sePresenter();
		p1.setNom("CHIWAWA");
		p1.setPrenom("Basile");
		
		
		System.out.println(p1.getNom());
		System.out.println(p1.getPrenom());
		

	}

}
