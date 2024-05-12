package fr.diginamic.maison;

import java.util.Arrays;

public class Maison {

	public Piece[] pieces;

	public Maison() {
		this.pieces = new Piece[0];
	}

	@Override
	public String toString() {

		String nomPiecesMaison = "";

		for (Piece piecesMaison : pieces) {
			nomPiecesMaison += " " + piecesMaison.getClass().getSimpleName();
		}
		return nomPiecesMaison;
	}

	public void ajouterPiece(Piece piece) {

		pieces = Arrays.copyOf(pieces, pieces.length + 1);
		pieces[pieces.length - 1] = piece;

	}
	
	public int getSuperficieTotale() {
		int superficie = 0;
		for (Piece piecesMaison : pieces) {
			superficie += piecesMaison.superficie;
		}
		return superficie;
		
	}
	
	public int getSuperficieEtage(int numEtage) {
		int superficieEtage = 0;
		for (Piece piecesMaison : pieces) {
			if (piecesMaison.getNumEtage() == numEtage) 
			superficieEtage += piecesMaison.superficie;
		}
		return superficieEtage;
	}

}
