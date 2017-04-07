package presentation;

import metier.Paire;
import metier.PaireGenerique;

public class Lanceur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Exemple sans généricité
		Paire p = new Paire ("abc","xyz");
		String x = (String)p.getPremier();
		//Double y = (Double)p.getSecond();// Erreur d'exécution
		
		
		System.out.println("x= " +x);
		//System.out.println("y= "+y);
		
		
		
		PaireGenerique <String> pg = new PaireGenerique <String> ("abc","xyz");
		String a = pg.getPremier();
		//Double b = pg.getSecond();//Erreur de compilation
		String b = pg.getSecond();
		System.out.println(pg);
		
		PaireGenerique <Integer> pg2 = new PaireGenerique <Integer> (12,30);
		System.out.println(pg2);
		
	}

}
