package Darman.part6;

import java.util.Arrays;
import java.util.Scanner;

public class Exo6_13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nombre de valeurs ?");
		int nbValeur =sc.nextInt();
		int[] table = new int[nbValeur];
		
		for (int i =0;i<nbValeur;i++) {
			System.out.print("valeurs\t " +(i+1)+"\t");
			 table[i]=sc.nextInt();
			 }
		int max=table[0];
		for(int i=1;i<nbValeur;i++) {
			if(table[i]>max) {
				max=table[i];
				
			}
		}
		System.out.printf("\ntable=%s\n",Arrays.toString(table));
		System.out.printf("L'entier le plus grand saisie est : %d",max);
		

	}

}
