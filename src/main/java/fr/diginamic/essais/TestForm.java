package fr.diginamic.essais;

import fr.diginamic.formes.Carre;
import fr.diginamic.formes.Cercle;
import fr.diginamic.formes.Rectangle;

import fr.diginamic.essais.AffichageForme;

public class TestForm {

	public Cercle cercle;
	public Rectangle rectangle;
	public Carre carre;

	public static void main(String[] args) {

		Cercle cercle = new Cercle(2.85);
		Rectangle rectangle = new Rectangle(8,4.5);
		Carre carre = new Carre(6);
		
		AffichageForme.afficher(cercle);
		AffichageForme.afficher(rectangle);
		AffichageForme.afficher(carre);

	}

}
