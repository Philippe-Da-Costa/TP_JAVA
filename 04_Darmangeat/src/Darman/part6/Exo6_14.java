package Darman.part6;

import java.util.Arrays;
import java.util.Scanner;

public class Exo6_14 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.printf("nombre de notes ? ");
		int nbNotes = sc.nextInt();
		double[] tableNotes = new double[nbNotes];

		double somme = 0, moyenne;
		for (int i = 0; i < nbNotes; i++) {
			System.out.printf("Saisir une note : ");
			tableNotes[i] = sc.nextDouble();
			somme = somme + tableNotes[i];
		}
		moyenne = somme / nbNotes;
		int more = 0;
		for (int i = 0; i < nbNotes; i++) {
			if (tableNotes[i] > moyenne)
				more++;
		}

		System.out.printf("\nnotes=%s\n", Arrays.toString(tableNotes));
		System.out.printf("Moyenne : %.2f\n", moyenne);
		System.out.printf("%d notes sont superieures a la moyenne", more);

		sc.close();

	}

}
