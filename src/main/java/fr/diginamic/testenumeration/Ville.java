package fr.diginamic.testenumeration;

import java.util.Objects;

import fr.diginamic.testenumeration.Continent;

public class Ville {

	private String nom;
	private int nbHabs;
	private Continent continent;
	public Ville(String nom, int nbHabs, Continent continent) {
		super();
		this.nom = nom;
		this.nbHabs = nbHabs;
		this.continent = continent;
		
	}
	

	@Override
	public String toString() {
		return "Ville [nom=" + nom + ", nbHabs=" + nbHabs + ", continent=" + continent + "]";
	}
	
	
	@Override 
	public boolean equals(Object object) {
		if (!(object instanceof Ville)) {
			System.out.println("false");
			return false;
	
		}
		Ville autre = (Ville)object;
		return Objects.equals(this.nom, autre.getNom()) && Objects.equals(this.nbHabs,  autre.getNbHabs());
	}
	
	/** Getter pour nom
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}
	/** Setter pour nom
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
	/** Getter pour nbHabs
	 * @return the nbHabs
	 */
	public int getNbHabs() {
		return nbHabs;
	}
	/** Setter pour nbHabs
	 * @param nbHabs the nbHabs to set
	 */
	public void setNbHabs(int nbHabs) {
		this.nbHabs = nbHabs;
	}
	/** Getter pour continent
	 * @return the continent
	 */
	public Continent getContinent() {
		return continent;
	}
	/** Setter pour continent
	 * @param continent the continent to set
	 */
	public void setContinent(Continent continent) {
		this.continent = continent;
	}




	
	
	
	
}