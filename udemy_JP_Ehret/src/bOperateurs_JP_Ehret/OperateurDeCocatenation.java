package bOperateurs_JP_Ehret;

public class OperateurDeCocatenation {

	public static void main(String[] args) {
		String maChaine = "Voici une chaine " + "concatené ! "; //aucun sens je l accorde
		System.out.println(maChaine);
		System.out.println();
		
		
		String debut = "Voici une chaine ";
		String fin  = "concatené !";;
		
		System.out.println("avec 2 variables");
		System.out.println(debut+fin);
		System.out.println();
		
		
		String debut1 = "mon age est :  ";
		int age   = 51;
		String fin1 = " ans";
		System.out.println("avec 2 types differents");
		System.out.println(debut1+age+fin1);
		System.out.println();
		
		System.out.println("Attention!!!");
		System.out.println(debut1+age+2+fin1); //512 penser aux parentheses 
		System.out.println();
		
		System.out.println("Avec parentheses ");
		System.out.println(debut1+(age+2)+fin1); //53 
		System.out.println();

	}

}
