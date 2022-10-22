package Operateurs_JP_Ehret;

//Reprenez HelloUniverse.java et faites en sortes de réduire à 2 lignes l'ensemble du texte affiché à l'écrant, 
//en concaténant le texte et le nombre de planètes sur une seule ligne à chaque fois :
//
//Aux dernières nouvelles, le nombre total de planètes dans le système solaire est de : 8
//Il y a quelques années cependant, elles étaient au nombre de : 9
//
//Vous n'utiliserez donc plus que 2 System.out.println 

public class LeCasPlutonV4 {

	public static void main(String[] args) {
		
		String dedut = "Aux dernières nouvelles, le nombre total de planètes dans le système solaire est de : ";
		String fin = "Il y a quelques années cependant, elles étaient au nombre de : ";
		int nbPlanete=8;
		
		System.out.println(dedut+nbPlanete);
		nbPlanete++;
		System.out.println(fin+nbPlanete);

	}

}
