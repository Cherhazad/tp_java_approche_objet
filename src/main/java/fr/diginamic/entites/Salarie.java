package fr.diginamic.entites;

public class Salarie {

	public String nom;
	public String prenom;
	public double salaire;
	
	
	public Salarie() {
	
	}
	
	
	public void ajoutSalarie(String[] newSalarie) {
		 this.nom = newSalarie[0];
		 this.prenom = newSalarie[1];
		 this.salaire = newSalarie[2];
	}

}
