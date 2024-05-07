package fr.diginamic.fichier;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class LectureFichier {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Path pathFile = Paths.get("/Users/plantsarelife/Desktop/Diginamic/Cours/11. Java/Approche POO/12. Java approche objet/TP/recensement.csv");
		List<String> lignes = Files.readAllLines(pathFile); //, StandardCharsets.UTF_8
		
		System.out.println(lignes.size());
		for (String ligne : lignes) {
			System.out.println(ligne);
		}

	}

}
