package TPS_JP_Ehret;

//Modifiez l'exercice précédent en créant une nouvelle variable qui accueillera successivement les phrases affichées à savoir :
//
//Aux dernières nouvelles, le nombre total de planètes dans le système solaire est de :
//
//Il y a quelques années cependant, elles étaient au nombre de :
//
//Votre code devra donc afficher successivement :
//
//   <La valeur de la nouvelle variable de type String  qui contient la phrase> 
//
//   <La valeur d'une variable de type int qui contient le nombre de planètes>
//
//   <La valeur de la MEME VARIABLE de type String  qui contient la phrase>
//
//   <La valeur de la MEME VARIABLE de type int qui contient le nombre de planètes>

public class LeCasPlutoV2 {

	public static void main(String[] args) {
		String maChaine;
		maChaine="Aux dernières nouvelles, le nombre total de planètes dans le système solaire est de : ";
		System.out.println(maChaine);
		
		int nbPlanete=8;
		System.out.println(nbPlanete);
		
		maChaine="Il y a quelques années cependant, elles étaient au nombre de : ";
		System.out.println(maChaine);
		nbPlanete=9;
		System.out.println(nbPlanete);
		

	}

}
