package fr.afpa.util;

// Mes imports 
import java.util.Scanner;

import fr.afpa.math.Math;

public class CalculFactor {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("saisir un nb");
		long nb = sc.nextLong();
		System.out.println("Methode non  recursive  " + Math.factorielleFor(nb));
		System.out.println("Méthode recursive  " + Math.factorielle(nb));
	}

}
