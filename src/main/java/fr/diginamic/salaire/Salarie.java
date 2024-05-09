package fr.diginamic.salaire;

public abstract class Salarie extends Intervenant {

	protected double salaireMensuel;

	public Salarie(String nom, String prenom, double salaireMensuel) {
		super(nom, prenom);
		this.salaireMensuel = salaireMensuel;
	}
	
	public double getSalaire() {
		return salaireMensuel;
	}

}
