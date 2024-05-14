package fr.diginamic.recensement;

import java.util.Scanner;

public class RecherchePopulationRegion extends MenuService{

	@Override
	public void traiter(Recensement recensement, Scanner scanner) {
		System.out.println("Veuillez saisir un nom de région: "); //un code région ou
		String regionChoisie = scanner.nextLine();
		System.out.println(recensement.getPopParRegion(regionChoisie));

		
	}

}
