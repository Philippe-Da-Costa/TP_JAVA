package TPS_JP_Ehret;

//Exercice
//Les scientifiques remettent régulièrement en question le nombre de planètes dans le système solaire. 
//Actuellement au nombre de 8, on en comptabilisait 9 avec Pluton il y a encore quelques années. 
//L'objectif est de reprendre le code "Hello Universe" en affichant successivement :
//
//Aux dernières nouvelles, le nombre total de planètes dans le système solaire est de : 
//
//<La valeur d'une variable de type int >
//
//Il y a quelques années cependant, elles étaient au nombre de : 
//
//<La valeur de la MÊME VARIABLE>
//
//
//Note : Attention, afin que le correcteur Udemy puisse valider votre code, 
//il est essentiel que le texte affiché à l'écran soit strictement identique à celui proposé dans l'énoncé. 
//Le respect de l'orthographe est donc essentiel.  

public class LeCasPluton {
	

	public static void main(String[] args) {
		int nb1=8;
		System.out.println("Hello Universe ! ");
		System.out.println("Aux dernières nouvelles, le nombre total de planètes dans le système solaire est de : "+nb1);
		nb1=9;
		System.out.println("  \nIl y a quelques années cependant, elles étaient au nombre de : "+(nb1));
		
		

	}

}
