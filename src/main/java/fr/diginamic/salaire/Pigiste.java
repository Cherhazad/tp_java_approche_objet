package fr.diginamic.salaire;

public abstract class Pigiste extends Intervenant {

	protected int nbJoursTravailles;
	protected double remunerationJour;

	public Pigiste(String nom, String prenom, int nbJoursTravailles, double remunerationJour) {
		super(nom, prenom);
		this.nbJoursTravailles = nbJoursTravailles;
		this.remunerationJour = remunerationJour;

	}

	public double getSalaire() {
		return remunerationJour * nbJoursTravailles;
	}
	

}
