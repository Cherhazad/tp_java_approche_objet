package listes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class TestListeInt {

	public static void main(String[] args) {

		List<Integer> array = new ArrayList<Integer>();
		Collections.addAll(array, -1, 5, 7, 3, -2, 4, 8, 5);

		System.out.println(array);
		System.out.println("Taille de la liste: " + array.size());

		// valeur max
		int maxValue = Collections.max(array);
		System.out.println("Valeur maximale: " + maxValue);

		// valeur min
		int minValue = Collections.min(array);
		System.out.println("Valeur minimale: " + minValue);

		// supprimer la plus petite valeur
		Iterator<Integer> iter = array.iterator();
		while (iter.hasNext()) {
			int minValue2 = iter.next();
			if (minValue2 == Collections.min(array)) {
				iter.remove();
			}
		}

		System.out.println(array);

		// conversion négatif au positif

		for (int i = 0; i < array.size(); i++) {
			if (array.get(i) < 0) {
				int negValue = Math.abs(array.get(i));
				array.set(i, negValue);
			}
		}
		System.out.println(array);
	}
}
