package fr.diginamic.formes;

public abstract class Cercle extends Forme {

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



	public double calculerSurface() {
		return rayon * rayon * 3.14;
	}
	
	public  double calculerPerimetre() {
		return 2 * 3.14 * rayon;
	}
	
}
