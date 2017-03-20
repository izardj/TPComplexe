package presentation;

import metier.Complexe;
import metier.Reel;
import service.ComplexeService;
import service.IComplexeService;
import service.IReelService;
import service.ReelService;

public class Lanceur {

	public static void main(String[] args) {
		// declaration service
		IComplexeService cs = new ComplexeService();
		IReelService rs = new ReelService();
		
		// declaration metier
		Complexe c1 = new Complexe(45, 10);
		Complexe c2 = new Complexe(20, 5);
		Reel r1 = new Reel(9);
		Reel r2 = new Reel(7);
		
		// utilisation
		Complexe resultatAddComplexe = cs.addition(c1, c2);
		Complexe resultatSubComplexe = cs.soustraction(c1, c2);
		Reel resultatAddReel = rs.addition(r1, r2);
		Reel resultatSubReel = rs.soustraction(r1, r2);
		
		// affichage
		System.out.println("----------------- NOMBRES COMPLEXES ------------------------");
		System.out.println("----------------- ADDITION ----------------------");
		System.out.println("Premier nb: " + c1);
		System.out.println("Second nb: " + c2);
		System.out.println("");
		System.out.println("Resultat: " + resultatAddComplexe);
		
		System.out.println("----------------- SOUSTRACTION ----------------------");
		System.out.println("Premier nb: " + c1);
		System.out.println("Second nb: " + c2);
		System.out.println("Resultat: " + resultatSubComplexe);
		
		System.out.println("----------------- NOMBRES REELS ------------------------");
		System.out.println("----------------- ADDITION ----------------------");
		System.out.println("Premier nb: " + r1);
		System.out.println("Second nb: " + r2);
		System.out.println("");
		System.out.println("Resultat: " + resultatAddReel);
		
		System.out.println("----------------- SOUSTRACTION ----------------------");
		System.out.println("Premier nb: " + r1);
		System.out.println("Second nb: " + r2);
		System.out.println("Resultat: " + resultatSubReel);
		
		
	}

}
