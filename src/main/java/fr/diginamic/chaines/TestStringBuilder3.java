package fr.diginamic.chaines;

public class TestStringBuilder3 {

	public static void main(String[] args) {

		long debut = System.currentTimeMillis();

		String builder = "0";
		for (int i = 1; i < 100001; i++) {
			builder.concat(Integer.toBinaryString(i));
		}

		System.out.println(builder);

		long fin = System.currentTimeMillis();

		System.out.println("Temps écoulé en millisecondes :" + (fin - debut));
		// 12ms
	}

}
