package entites;

public class TestAdressePostale {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AdressePostale a1 = new AdressePostale(2, "Rue Rivoli", 34000, "Montpellier");
		System.out.println(a1);


		AdressePostale a2 = new AdressePostale(56, "Rue des Sapins", 34000, "Montpellier");
		System.out.println(a2);
	
		a1.setVille("Paris");
		System.out.println(a1.getVille());
	}

}
