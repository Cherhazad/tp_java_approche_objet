package fr.diginamic.salaire;

public class Salarie extends Intervenant {

	protected double salaireMensuel;

	public Salarie(String nom, String prenom, double salaireMensuel) {
		super(nom, prenom);
		this.salaireMensuel = salaireMensuel;
	}
	
	public String getSalaire() {
		return "Salaire: " + salaireMensuel;
	}
	
	@Override
	public String toString() {
		return "Salaire mensuel du salarie: ";
	}
	
	@Override
	public String getStatut() {
		return "Statut: salarié du journal";
	}

}
