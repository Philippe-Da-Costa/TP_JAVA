package fr.afpa.math;

public class TestMath {

	public static void main(String[] args) {
		factorielleTestzero();
		factorielleTestUn();
		factorielleTest20();
    	factorielleTest21();
 		factorielleTest45();
		factorielleTestmoinsUn();
		}

	private static void factorielleTestzero() {

		if (Math.factorielle(0) == 1) {
			System.out.println("TEST ok");
		} else {
			System.err.println("TEST not ok : La factorielle de 0 vaut 1");
		}
	}
	

	private static void factorielleTestUn() {

		if (Math.factorielle(1) == 1) {
			System.out.println("TEST ok");
		} else {
			System.err.println("TEST not ok : La factorielle de 0 vaut 1");
		}
	}
	
	private static void factorielleTest20() {
		
		if (Math.factorielle(20) == 2_432_902_008_176_640_000L) {
			System.out.println("TEST ok");
		} else {
			System.err.println("TEST not ok ");
		}
	}
	
	private static void factorielleTest21() {
		
		if (Math.factorielle(21) == -2) {
			System.out.println("TEST ok");
		} else {
			System.err.println("TEST not ok :la factorielle de 21 est hors limite du \"long\"");
		}
	}
	private static void factorielleTest45() {
		
		if (Math.factorielle(45) == -2) {
			System.out.println("TEST ok");
		} else {
			System.err.println("TEST not ok :la factorielle de 21 est hors limite du \"long\"");
		}
	}
	
	
	private static void factorielleTestmoinsUn() {
		
		if (Math.factorielle(-1) == -1) {
			System.out.println("TEST ok");
		} else {
			System.err.println("TEST not ok :il n'a pas de factorielle pour les entiers négatif !!");
		}
	}
	
	
	

}
