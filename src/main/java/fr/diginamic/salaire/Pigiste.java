package fr.diginamic.salaire;

public class Pigiste extends Intervenant {

	protected int nbJoursTravailles;
	protected double remunerationJour;

	public Pigiste(String nom, String prenom, int nbJoursTravailles, double remunerationJour) {
		super(nom, prenom);
		this.nbJoursTravailles = nbJoursTravailles;
		this.remunerationJour = remunerationJour;

	}

	public String getSalaire() {
		return "Salaire: " + remunerationJour * nbJoursTravailles;
	}
	
	
	public String getJoursTravailles() {
		return "sur " + nbJoursTravailles + " jours travaillés: ";
	}
	
	@Override
	public String toString() {
		return "Salaire total du pigiste ";
	}
	
	@Override
	public String getStatut() {
		return "Statut: pigiste";
	}

}
