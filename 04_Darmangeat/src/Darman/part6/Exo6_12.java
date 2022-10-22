package Darman.part6;

import java.util.Arrays;
import java.util.Scanner;

public class Exo6_12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("choisir le nombre de valeur a saisir SVP...");
		int nbValeurs = sc.nextInt();

		int[] tab1 = new int[nbValeurs], tabPlus1 = new int[nbValeurs];
		for (int i = 0; i < nbValeurs; i++) {
			System.out.println("valeur " + i + 1);
			tab1[i] = sc.nextInt();
			tabPlus1[i] = tab1[i] + 1;
		}
		for (int i = 0; i < nbValeurs; i++) {
			System.out.println(tabPlus1[i]);
		}
		System.out.println("le nouveau tableau :" +Arrays.toString(tabPlus1));
	}

}
