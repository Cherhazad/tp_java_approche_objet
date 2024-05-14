package fr.diginamic.recensement;

public class Ville {

	int codeRegion;
	String nomRegion;
	String codeDepartement;
	String codeCommune;
	String nomCommune;
	int popTotale;

	public Ville(int codeRegion, String nomRegion, String codeDepartement, String codeCommune, String nomCommune,
			int popTotale) {
		this.codeRegion = codeRegion;
		this.nomRegion = nomRegion;
		this.codeDepartement = codeDepartement;
		this.codeCommune = codeCommune;
		this.nomCommune = nomCommune;
		this.popTotale = popTotale;

	}

	@Override
	public String toString() {
		return nomCommune + " - " + popTotale;
	}
	
}
