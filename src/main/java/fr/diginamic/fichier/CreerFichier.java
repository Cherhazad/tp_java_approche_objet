package fr.diginamic.fichier;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.List;

public class CreerFichier {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Path pathFile = Paths.get(
				"/Users/plantsarelife/Desktop/Diginamic/Cours/11. Java/Approche POO/12. Java approche objet/TP/recensement.csv");

		List<String> lignes = Files.readAllLines(pathFile);
		ArrayList<String> lignes100 = new ArrayList();
		
		
		for (int i = 0; i < 100; i++) {
			System.out.println(lignes.get(i));
			lignes100.add(lignes.get(i));
		}
		
		Path pathCible = Paths.get("/Users/plantsarelife/Desktop/Diginamic/Cours/11. Java/Approche POO/12. Java approche objet/TP/recensement2.csv");
		Files.write(pathCible, lignes100);
		
	}

}
