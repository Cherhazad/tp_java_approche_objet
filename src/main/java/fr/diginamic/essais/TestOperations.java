package fr.diginamic.essais;

import fr.diginamic.operations.Operations;

public class TestOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		Operations soustraction = new Operations();
		soustraction.calcul(2, 5, '-');
		
		
		Operations addition = new Operations();
		addition.calcul(2, 5, '+');
		
		
		Operations division = new Operations();
		division.calcul(2, 5, '/');
		
		Operations multiplication = new Operations();
		multiplication.calcul(2, 5, '*');
		
	}

}
