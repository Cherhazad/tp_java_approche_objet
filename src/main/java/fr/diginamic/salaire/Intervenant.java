package fr.diginamic.salaire;

public abstract class Intervenant {

	String nom;
	String prenom;

	public Intervenant(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
	}

	public abstract String getSalaire();

	public abstract String getStatut();

	public String afficherDonnees() {
		return "Nom: " + nom + " - " + "Prénom: " + prenom + " - " + getStatut() + " - " + getSalaire() + "€.";

	}

}
