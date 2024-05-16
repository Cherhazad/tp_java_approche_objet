package fr.diginamic.testenumeration;

public enum Continent {
	
	ASIE("asie"),
	EUROPE("europe"),
	OCEANIE("oceanie"),
	AFRIQUE("afrique"),
	AMERIQUE("amerique");
	
	private String libelle;

	private Continent(String libelle) {
		this.libelle = libelle;
	}

	/** Getter pour libelle
	 * @return the libelle
	 */
	public String getLibelle() {
		return libelle;
	}

	/** Setter pour libelle
	 * @param libelle the libelle to set
	 */
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	
	
	
	

}
