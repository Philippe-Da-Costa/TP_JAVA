package Operateurs_JP_Ehret;
//Reprenez HelloUniverse.java et faites en sortes que la variable qui représente le nombre de planètes 
//passe de 8 à 9 entre les 2 affichages grâce à l'opérateur d'incrémentation.

public class LeCasPlutonV3 {

	public static void main(String[] args) {
		String maChaine="Aux dernières nouvelles, le nombre total de planètes dans le système solaire est de : ";
		System.out.println(maChaine);
		
		int nbPlanete=8;
		System.out.println(nbPlanete);
		
		maChaine="Il y a quelques années cependant, elles étaient au nombre de : ";
		System.out.println(maChaine);
		nbPlanete++;
		System.out.println(nbPlanete);

	}

}