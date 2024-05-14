package fr.diginamic.recensement;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ApplicationRecensement {

	public static void main(String[] args) throws IOException {

		// lecture fichier
		Path cheminFichier = Paths.get(
				"/Users/plantsarelife/Desktop/Diginamic/Cours/11. Java/Approche POO/12. Java approche objet/TP autoformation J2/recensement.csv");
		List<String> lignes = Files.readAllLines(cheminFichier);
		List<Ville> villesRecensees = new ArrayList();
		String ligneColonne = lignes.remove(0);

		for (String ligne : lignes) {
			String[] elements = ligne.split(";");
			int codeRegion = Integer.parseInt(elements[0]);
			String nomRegion = elements[1];
			String codeDepartement = elements[2];
			String codeCommune = elements[5];
			String nomCommune = elements[6];
			int popTotale = Integer.parseInt(elements[9].replace(" ", ""));

			Ville ville = new Ville(codeRegion, nomRegion, codeDepartement, codeCommune, nomCommune, popTotale);
			villesRecensees.add(ville);
		}

		System.out.println("Le nombre d'instances de villes est de: " + lignes.size());

		// for (Ville ville : villesRecensees) {
		// System.out.println(ville);
		// }

		// stockage villes recensées
		Recensement recensement = new Recensement(villesRecensees);
		//System.out.println(recensement.getPopParVille("Saint-Philippe"));

		// scanner
		Scanner scanner = new Scanner(System.in);
		System.out.println("Veuillez saisir une option: ");
		int choix = Integer.parseInt(scanner.nextLine());

		switch (choix) {
		case 1:
			RecherchePopulationVille recherche = new RecherchePopulationVille();
			recherche.traiter(recensement, scanner);
			break;
			
		case 2:
			RecherchePopulationDepartement recherche2 = new RecherchePopulationDepartement();
			recherche2.traiter(recensement, scanner);
			break;
			
		case 3:
			RecherchePopulationRegion recherche3 = new RecherchePopulationRegion();
			recherche3.traiter(recensement, scanner);
			break;
			
		case 4:
	
		}
		scanner.close();
	}
}
