package fr.diginamic.formes;

public class Carre extends Rectangle {

	public Carre(double longueur) {
		super(longueur);

	}

	public double calculerSurface() {
		return longueur * longueur;
	}

	public double calculerPerimetre() {
		return longueur * 4;
	}

	@Override
	public String toString() {
		return "carré ";
	}

}
