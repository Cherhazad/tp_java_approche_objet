package listes;

import java.util.Objects;

public class Ville {

	private String nom;
	private int nbHabs;
	public Ville(String nom, int nbHabs) {
		super();
		this.nom = nom;
		this.nbHabs = nbHabs;
		
	}
	@Override
	public String toString() {
		return "Ville [nom=" + nom + ", nbHabs=" + nbHabs + "]";
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
	
}