package fr.diginamic.essais;

import fr.diginamic.formes.Forme;

public abstract class AffichageForme {

	Forme formeGeometrique; //probablement à corriger

	public void afficher(Forme formeGeometrique) {
		calculerSurface();
		calculerPerimetre();

	}

	public abstract double calculerSurface();

	public abstract double calculerPerimetre();

}