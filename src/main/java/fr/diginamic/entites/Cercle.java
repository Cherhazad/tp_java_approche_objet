package fr.diginamic.entites;

public class Cercle {

	private double rayon;
	
	public Cercle(double rayon) {
		this.rayon = rayon;
	}

	public double getRayon() {
		return rayon;
	}

	public void setRayon(double rayon) {
		this.rayon = rayon;
	}
	
	public double perimetre() {
		return 2 * 3.14 * rayon;
	}
	
	public double surface() {
		return rayon * rayon * 3.14;
	}

}
