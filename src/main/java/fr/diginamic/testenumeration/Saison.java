package fr.diginamic.testenumeration;

public enum Saison {

	PRINTEMPS("Printemps", 1), ETE("Été", 2), AUTOMNE("Automne", 3), HIVER("Hiver", 4);

	private String libelle;
	private int numero;

	/**
	 * Constructeur
	 * 
	 * @param libelle
	 * @param numero
	 */
	private Saison(String libelle, int numero) {
		this.libelle = libelle;
		this.numero = numero;

	}

	/**
	 * Getter pour libelle
	 * 
	 * @return the libelle
	 */
	public String getLibelle() {
		return libelle;
	}

	/**
	 * Getter pour numero
	 * 
	 * @return the numero
	 */
	public int getNumero() {
		return numero;
	}
	
	@Override
	public String toString() {
		return libelle + " " + numero;
	}

	
	public static String getInstanceSaison(String value) {
		Saison[] lesSaisons = Saison.values();
		for (Saison saison : lesSaisons) {
			//System.out.println(libelle);
			if (saison.getLibelle().equals(value)) {
				System.out.println(saison);

			}
		}
		return value;
	}

}
