package fr.diginamic.formes;

public class Rectangle extends Forme {

	protected double longueur;
	private double largeur;

	public Rectangle(double longueur, double largeur) {
		this.longueur = longueur;
		this.largeur = largeur;

	}

	public Rectangle(double longueurCarre) {
		this.longueur = longueurCarre;

	}

	public double calculerSurface() {
		return longueur * largeur;
	}

	public double calculerPerimetre() {
		return (longueur + largeur) * 2;
	}

	@Override
	public String toString() {
		return "rectangle ";
	}

}
