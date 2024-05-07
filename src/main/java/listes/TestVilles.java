package listes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestVilles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Ville> villes = new ArrayList<Ville>();
		//villes.add( "Nice", "Carcassonne", "Narbonne", "Lyon", "Foix", "Pau", "Marseille", "Tarbes");

		villes.add(new Ville("Nice",343000));
		villes.add(new Ville("Carcasonne",47800));
		villes.add(new Ville("Naarbonne",53400));
		villes.add(new Ville("Lyon",484000));
		villes.add(new Ville("Foix",9700));
		villes.add(new Ville("Pau",77200));
		villes.add(new Ville("Marseille",850700));
		villes.add(new Ville("Tarbes",40600));
		
		//Ville la plus peuplée
		Ville villeMax = new Ville("", 0);
		for (int i=0; i<villes.size(); i++) {
			Ville villeCourante = villes.get(i);
		//	if (villeMax == null || > villeMax.getNbHabs()) {
				
			}
		}
		//System.out.println(villeMax);
		
		//récupérer corrigé sur git hub de Richard
	}

//}
