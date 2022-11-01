package aTPS_JP_Ehret;

public class HelloWorld {
	
	public static void affichage() {
		System.out.println("Hello world !");
	}

	public static void main(String[] args) {
		System.out.println("standard : ");
		System.out.println("Hello world !");
		
		System.out.println();
		String maChaineString;
		maChaineString="Hello world !";
		System.out.println("via variable : ");
		System.out.println(maChaineString);
		
		System.out.println();
		System.out.println("via une methode : ");
		affichage();

	}

}
