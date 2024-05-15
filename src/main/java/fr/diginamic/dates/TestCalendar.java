package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class TestCalendar {

	public static void main(String[] args) {
		Locale france = Locale.FRANCE;

		// création d'une instance à une date spécifique

		Calendar cal = Calendar.getInstance(); //crée un calendar
		cal.set(2016, 4, 19, 23, 59, 00);
		Date d1 = cal.getTime();
		//System.out.println(d1).

		SimpleDateFormat formateur = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("Date convertie: " + formateur.format(d1));
		
		Date dateJour = Calendar.getInstance().getTime();
		System.out.println("Date convertie: " + formateur.format(dateJour));
		
		//Afficher l'instance en fonction des pays
		
		SimpleDateFormat formateurChinois = new SimpleDateFormat("EEEE dd MMMM yyyy HH:mm:ss", Locale.CHINA);
		System.out.println("Date convertie Chine: " + formateurChinois.format(dateJour));
		
		SimpleDateFormat formateurFrance = new SimpleDateFormat("EEEE dd MMMM yyyy HH:mm:ss", Locale.FRANCE);
		System.out.println("Date convertie France: " + formateurFrance.format(dateJour));
		
		SimpleDateFormat formateurAllemagne = new SimpleDateFormat("EEEE dd MMMM yyyy HH:mm:ss", Locale.GERMAN);
		System.out.println("Date convertie Allemagne: " + formateurAllemagne.format(dateJour));
		
		SimpleDateFormat formateurRusse = new SimpleDateFormat("EEEE dd MMMM yyyy HH:mm:ss", new Locale("ru", "RU"));
		System.out.println("Date convertie Allemagne: " + formateurRusse.format(dateJour));
		
		
		

	}

}
