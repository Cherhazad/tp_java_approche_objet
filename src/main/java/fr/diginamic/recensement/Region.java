package fr.diginamic.recensement;
import java.util.Scanner;

public class Region extends MenuService{

	@Override
	public void traiter(Recensement recensement, Scanner scanner) {
		System.out.println("Vous souhaitez afficher les 10 régions les plus peuplées: ");
		String regionsDix = scanner.nextLine(); //faire une condition dans recensement pour en fonction de oui ou non 
		System.out.println(recensement.getDixRegion());
		
	}
	
	
	
	
	//Etablir une méthode qui additionne la pop totale par région, qui trie par ordre décroissant et récupère les 10 premières.
}
