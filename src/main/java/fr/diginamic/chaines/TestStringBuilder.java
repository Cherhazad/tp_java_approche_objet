package fr.diginamic.chaines;

public class TestStringBuilder {

	public static void main(String[] args) {

		long debut = System.currentTimeMillis();


		StringBuilder builder = new StringBuilder();
		for (int i = 1; i < 100001; i++) {
			builder.append(i);
		}

		System.out.println(builder);

		long fin = System.currentTimeMillis();

		System.out.println("Temps écoulé en millisecondes :" + (fin - debut));
		// 8ms
	}

}
