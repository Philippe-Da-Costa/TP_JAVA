package Darman.part3;
import java.util.Scanner;
public class Exo3_05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int nb1, nb2;
		System.out.print("Choisir un premier nombre ");
		nb1=sc.nextInt();
		System.out.print("Choisir un second nombre ");
		nb2=sc.nextInt();
		
		if (nb1==0 || nb2==0){
			System.out.println("le produit  est null");
		}else if((nb1<0 && nb2<0)||(nb1>0 && nb2>0)) {
			System.out.println("le produit est positif");
		}else {
			System.out.println("le produit est negatif");
		}
		
	}
	

}
