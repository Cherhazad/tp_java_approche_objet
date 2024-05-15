package fr.diginamic.recensement;

import java.util.List;

import java.util.Scanner;

public class Recensement {

	public List<Ville> listVilles;

	public Recensement(List<Ville> listVilles) {
		this.listVilles = listVilles;
	}

	public int getPopParVille(String nomCommune) {
		int pop = 0;
		for (Ville ville : listVilles) {
			if (ville.nomCommune.equals(nomCommune)) {
				pop = ville.popTotale;
			}
		}
		return pop;
	}

	public int getPopParDepartement(String codeDepartement) {
		int popDep = 0;
		if (Integer.parseInt(codeDepartement) < 10) { // car ne prenait pas le 1 pour le calcul de la population totale
														// par departement

			codeDepartement = "0" + codeDepartement;
		}
		for (Ville ville : listVilles) {
			if (ville.codeDepartement.equals(codeDepartement)) {
				popDep += ville.popTotale;
			}
		}
		return popDep;
	}

	public int getPopParRegion(String nomRegion) {

		int popRegion = 0;

		for (Ville ville : listVilles) {
			if (ville.nomRegion.equals(nomRegion)) { // ville.codeRegion == Integer.parseInt(inputRegion) ||
				popRegion += ville.popTotale;
			}
		}
		return popRegion;
	}

//	public int getDixRegion() {
//		
//		villesCroissantes = listVilles.sort();
//		
//	}

}
