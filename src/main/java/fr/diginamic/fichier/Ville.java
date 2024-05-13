package fr.diginamic.fichier;

public class Ville implements Comparable<Ville> {

	private String nomRegion;
	private String codeDept;
	private String nom;
	private int pop;

	public Ville(String nomRegion, String codeDept, String nom, int pop) {
		super();
		this.nomRegion = nomRegion;
		this.codeDept = codeDept;
		this.nom = nom;
		this.pop = pop;
	}

	@Override
	public String toString() {
		return "Ville [nomRegion=" + nomRegion + ", codeDept=" + codeDept + ", nom=" + nom + ", pop=" + pop + "]";
	}

	public String toCsv() {
		return nomRegion + ";" + codeDept + ";" + nom + ";" + pop;
	}

	public int compareTo(Ville autre) {

		// return nom.compareTo(autre.getNom()); //pour trier par nom
		return -this.nom.compareTo(autre.getNom()); // tri dans l'ordre décroissant

		// if (this.pop > autre.getPop()) { //pour trier par nombre d'habitants
		// return 1;
		// }
		// if (this.pop < autre.getPop()) {
		// return -1;
		// }
		// return 0;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getPop() {
		return pop;
	}

	public void setPop(int pop) {
		this.pop = pop;
	}

}