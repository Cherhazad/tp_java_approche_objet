package fr.diginamic.recensement;

import java.util.Scanner;

public class RecherchePopulationDepartement extends MenuService {

	@Override
	public void traiter(Recensement recensement, Scanner scanner) {

		System.out.println("Veuillez saisir un code département: ");
		String departementChoisi = scanner.nextLine();
		System.out.println(recensement.getPopParDepartement(departementChoisi));

	}

}
