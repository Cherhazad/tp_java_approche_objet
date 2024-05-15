package fr.diginamic.dates;

import java.text.SimpleDateFormat;

import java.util.Date;

public class TestDates {

	public static void main(String[] args) {

		// création instance du constructeur Date à la date du jour
		Date d = new Date();
		SimpleDateFormat formateur = new SimpleDateFormat("dd/MM/yyyy");
		String chaineD1 = formateur.format(d);
		System.out.println(chaineD1);
		
		//création instance à une date précise

		Date d2 = new Date(116, 4, 19, 23, 59, 00);
		SimpleDateFormat formateur2 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		String chaineD2 = formateur2.format(d2);
		System.out.println(chaineD2);
		
		//ou plus rapide System.out.println(formateur2.format(d2));

		Date dateSys = new Date();
		System.out.println(formateur2.format(dateSys));

	}

}
