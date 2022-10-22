package StructuresConditionnelles;

public class StructureConditionnelleElseIf {

	public static void main(String[] args) {
		int age =20;
		System.out.printf("Mon age est : %d ans ",age);
		if (age>=30) {
			System.out.println("\nOui je fais plus jeune !");
		}else if (age<10) {
			System.out.println("\nBravo a toi de commencer si jeune ! ");
		}else if (age==25) {
			System.out.println("\nVous devez etre en pleine forme! ");
		}else {System.out.println("\nEt je suis fier de mo age !");
	}

}}
