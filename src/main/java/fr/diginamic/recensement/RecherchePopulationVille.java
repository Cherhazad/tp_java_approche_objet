package fr.diginamic.recensement;

import java.util.Scanner;

public class RecherchePopulationVille extends MenuService{
	

	@Override
	public void traiter(Recensement recensement, Scanner scanner) {

		System.out.println("Veuillez saisir une commune: ");
		String communeChoisie = scanner.nextLine();
		System.out.println(recensement.getPopParVille(communeChoisie));
		
	}

}
