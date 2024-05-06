package fr.diginamic.essais;

import java.util.Arrays;

import fr.diginamic.operations.CalculMoyenne;

public class TestMoyenne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1er essai
		
		double[] array = { 2, 7, 4, 89, 54, 1 };

		CalculMoyenne moy1 = new CalculMoyenne(array);
		moy1.ajout(16);
		
		//System.out.println(Arrays.toString(array)); Ne marche pas
		
		
		double result = moy1.calcul();
		System.out.println("La moyenne des valeurs du tableau est de: " + result);


		
		//2nd essai
		
		double[] array2 = { 6, 3, 100, 18, 64, 9 };

		
		CalculMoyenne moy2 = new CalculMoyenne(array2);
		moy2.ajout(1000);
		
		
		double result2 = moy2.calcul();
		System.out.println("La moyenne des valeurs du tableau est de: " + result2);

	}

}
