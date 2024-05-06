package fr.diginamic.operations;

import java.util.Arrays;

public class CalculMoyenne {

	double[] array;

	public void ajout(double a) {
		array = Arrays.copyOf(array, array.length + 1);
		array[array.length -1] = a;
		

	}

	public CalculMoyenne(double[] array) {
		this.array = array;
	}

	public double calcul() {

		System.out.println(Arrays.toString(array));
		int somme = 0;
		for (int i = 0; i < array.length; i++) {
			somme += array[i];
			// System.out.println(somme);
		}

		double moy = somme / array.length;
		return moy;
		
	}

}
