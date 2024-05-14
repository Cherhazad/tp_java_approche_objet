package fr.diginamic.maps;

public class Pays {

	private String nomPays;
	private int nbHabitants;
	private String nomContinent;

	public Pays(String nomPays, int nbHabitants, String nomContinent) {
		this.nomPays = nomPays;
		this.nbHabitants = nbHabitants;
		this.nomContinent = nomContinent;
	}
	
	
	
	@Override
	public String toString() {
		return nomPays + " " + nbHabitants + " " + nomContinent;
	}



	public String getNomPays() {
		return nomPays;
	}



	public void setNomPays(String nomPays) {
		this.nomPays = nomPays;
	}



	public String getNomContinent() {
		return nomContinent;
	}



	public void setNomContinent(String nomContinent) {
		this.nomContinent = nomContinent;
	}

}
