package fr.diginamic.formes;

public abstract class Rectangle extends Forme {

	protected double longueur;
	private double largeur;

	public Rectangle(double longueur, double largeur) {
		this.longueur = longueur;
		this.largeur = largeur;

	}

	public double getLongueur() {
		return longueur;
	}

	public void setLongueur(double longueur) {
		this.longueur = longueur;
	}

	public double getLargeur() {
		return largeur;
	}

	public void setLargeur(double largeur) {
		this.largeur = largeur;
	}

	public double calculerSurface() {
		return longueur * largeur;
	}

	public double calculerPerimetre() {
		return (longueur + largeur) * 2;
	}

}
