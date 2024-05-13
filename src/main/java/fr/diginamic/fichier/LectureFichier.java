package fr.diginamic.fichier;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class LectureFichier {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		ArrayList<String> ville = new ArrayList();
		
		Path pathFile = Paths.get("/Users/plantsarelife/Desktop/Diginamic/Cours/11. Java/Approche POO/12. Java approche objet/TP/recensement.csv");
		List<String> lignes = Files.readAllLines(pathFile); //, StandardCharsets.UTF_8
		ArrayList<String> lignesInstanciees = new ArrayList();

		for (int i = 0; i<lignes.size(); i++) {
			
			lignesInstanciees.add(lignes.get(i));
			//String[] tokens = lignesInstanciees.split(";");
		}
		
		
		System.out.println(lignes.size());
		for (String ligne : lignes) {
			System.out.println(ligne);
		}

	}

}
