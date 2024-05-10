package fr.diginamic.maison;

import java.util.Arrays;

public class Maison {

	Piece[] pieces;

	public static void ajouterPiece(Piece[] piece) {

		String Piece[] = null;
		int n = Piece.length;
		String newPiece[] = new String[n + 1];
		Piece[] value = piece;
		System.out.println(Arrays.toString(Piece));
		for (int i = 0; i < n; i++) {
			newPiece[i] = Piece[i];
		}
		newPiece[n] = value;
		System.out.println(Arrays.toString(newPiece));
	
	//voir avec la méthode Array.newInstance() https://www.javatpoint.com/java-array-newinstance-method#:~:text=→%20←%20prev-,Java%20Array%20newInstance()%20Method,the%20new%20array%20has%20dimensions.
	
	}
}
