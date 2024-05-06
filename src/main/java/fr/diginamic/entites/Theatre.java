package fr.diginamic.entites;

public class Theatre {

	String name;
	int capMax;
	int totalInscrits;
	double recettes;

	public Theatre(String name, int capMax, int totalInscrits, double recettes) {
		super();
		this.name = name;
		this.capMax = capMax;
		this.totalInscrits = totalInscrits;
		this.recettes = recettes;
	}

	public void inscrire(int nbClients, double prix) {

		if ((totalInscrits + nbClients) <= capMax) {
			totalInscrits += nbClients;
			System.out.println(nbClients + " clients viennent de s'inscrire, il reste " + (capMax - totalInscrits) + " places.");
			recettes += prix * nbClients;
		} else
			System.out.println("erreur, nb max atteint");

	}

	@Override
	public String toString() {
		return name + " " + capMax + " " + totalInscrits + " " +recettes;
	}

}
