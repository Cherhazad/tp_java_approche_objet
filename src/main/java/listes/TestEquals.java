package listes;

public class TestEquals {

	public static void main(String[] args) {

		// rechercher la correction
		Ville ville1 = new Ville("Paris", 1253876);
		Ville ville2 = new Ville("Paris", 1253876);

		if (ville1.equals(ville2)) {
			System.out.println("elle sont identiques");
		} else {
			System.out.println("elle sont différentes");
		}

		if (ville1 == ville2) {
			System.out.println("elle sont identiques");
		} else {
			System.out.println("elle sont différentes");
		}

		ville1 = ville2;
		
		if (ville1 == ville2) {
			System.out.println("elle sont identiques");
		} else {
			System.out.println("elle sont différentes");
		}

	}

}
