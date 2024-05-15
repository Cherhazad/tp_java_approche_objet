package fr.diginamic.dates;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class ExempleCours {

	public static void main(String[] args) throws ParseException {
		
		//version 1.0 du langage
		Date d = new Date(124, 4, 14, 12, 30, 0);
		System.out.println(d);
		
		//Version 1.1 du langage
		Calendar cal = Calendar.getInstance();
		cal.set(2024, 4, 14, 12, 30, 0); //le problème de la date a été mis à jour, comme à 0 et non à 1900 comme en version 1.0 mais le mois commence toujours à 0 donc le mois de mai se note mois n°4
		Date d2 = cal.getTime();
		System.out.println(d2);
		
		cal.setTime(d);
		cal.set(Calendar.HOUR_OF_DAY, 11); //si on veut modifier la date qu'on a mis dans d
		
		System.out.println(cal.getTime());
		
		// Format attendu en FR : jj/mm/aaa hh/mi:ss
		
		SimpleDateFormat formateur = new SimpleDateFormat("EEEE yyyy/MM/dd HH:mm:ss"); //Spécifier le format, EEEE pour afficher le jour en entier EEE en abbrégé...
		String dateConvertie = formateur.format(d);
		System.out.println("dateConvertie: " + dateConvertie);
		
		// parse 
		SimpleDateFormat formateur2 = new SimpleDateFormat("dd/MM/yyyy");
		String chaine = "12/03/2024";
		Date dateModification = formateur2.parse(chaine);
		System.out.println(dateModification);
	}

}
