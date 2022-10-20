package SyntaxeDeBase;

public class BIncDec {

	public static void main(String[] args) {
		int a =10;
		a++; //post incrementation
		System.out.println("a++ resultat : " +a);
		
		int b =10;
		++b; //pre incrementation
		System.out.println("++b resultat : " +b);
		
		int c =10;
		System.out.println("++c dans l affichage resultat : " + (++c));
		
		
		
		System.out.println();
		System.out.println("attention a la pre ou post incrementation ");
		
		int nb1= 10;
		System.out.println(" post incrementation me donne : "+(++nb1)); //prefixé => incrementation avant utilisation de la variable!!
		
		 nb1= 10;
		System.out.println(" pré incrementation me donne : "+(nb1++)); //postfixé => incrementation apres utilisation de la variable!!
		System.out.println(" reaffichage de  nb1 : "+nb1 +" .le calcule se fait apres");
		
		System.out.println();
		System.out.println("un autre exemple");
		System.out.println("POST");
		int part1=10;
		int part2=20;
		int result= part1++ + part2++;
		
		System.out.println(result+" \nle calcul s'est fait apres pour part1 : "+part1+" \nle calcul s'est fait apres pour part1 : "+part2);
		
		System.out.println();
		System.out.println("PRE");
		int part3=10;
		int part4=20;
		int result1= ++part3 + ++part4;
		
		System.out.println(result1+" \nle calcul s'est fait avant pour part3 : "+part3+" \nle calcul s'est fait avant pour part4 : "+part4);
	}

}
