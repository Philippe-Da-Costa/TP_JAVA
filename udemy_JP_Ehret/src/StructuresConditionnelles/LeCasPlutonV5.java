package StructuresConditionnelles;

public class LeCasPlutonV5 {

	public static void main(String[] args) {
		int nbPlanete = 8;
		int annee = 2003;
		String dedut = "Aux dernières nouvelles, le nombre total de planètes dans le système solaire est de : ";
		String fin = "Il y a quelques années cependant, elles étaient au nombre de : ";

		System.out.println(dedut + nbPlanete);
		nbPlanete++;
		System.out.println(fin + nbPlanete);

		nbPlanete = 9;
		if (annee < 2006) {
			System.out.println("En " + annee + " , les planètes du système solaire étaient au nombre de :" + nbPlanete);
		}
		if (annee >= 2006) {
			System.out.println("En " + annee + ", les planètes du système solaire étaient au nombre de :" + (--nbPlanete));
		}
	}
}
