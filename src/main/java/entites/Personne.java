package entites;

public class Personne {

	String nom;
	String prenom;
	AdressePostale adresse;

	public Personne(String nvNom, String nvPrenom, AdressePostale nvAdresse) {
		nom = nvNom;
		prenom = nvPrenom;
		adresse = nvAdresse;

	}

	public void sePresenter() {

		System.out.println(nom.toUpperCase() + " " + prenom);

	}

	public void setNom(String nom) {
		// permet de modifier juste le nom d'une personne
		this.nom = nom;

	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public void setAdresse(AdressePostale adresse) {
		this.adresse = adresse;
	}

	
	// returns

	public String getNom() {
		// permet de modifier juste le nom d'une personne
		return nom;

	}

	public String getPrenom() {
		return prenom;
	}
	
	public AdressePostale getAdresse() {
		return adresse;
	}
	

}
