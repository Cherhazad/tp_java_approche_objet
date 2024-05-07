package fr.diginamic.fichier;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class CreerFichier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Path pathFile = Paths.get("/Users/plantsarelife/Desktop/Diginamic/Cours/11. Java/Approche POO/12. Java approche objet/TP/recensement.csv");
		List<String> lignes = Files.readAllLines(pathFile).substring(0, 100);
	}

}
