package Darman.part2;
import java.util.Scanner;
public class Exo2_02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int nb;
System.out.println("Entrer un nombre Svp");
        nb = sc.nextInt();
		int careeNb= (int)Math.pow(nb,2);
		System.out.println("Le carre du nombre "+nb+" est: "+careeNb);
	}
}
