package fr.diginamic.formes;

public abstract class Carre extends Rectangle {

	public Carre(double longueur) {
		super(longueur, longueur);
		this.longueur = longueur;
		// TODO Auto-generated constructor stub
	}

	public double calculerSurface() {
		return longueur * longueur;
	}

	public double calculerPerimetre() {
		return longueur * 4;
	}

}
