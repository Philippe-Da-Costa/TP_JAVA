package cStructuresConditionnelles;

public class LeCasPlutonV6 {

	public static void main(String[] args) {
		 String phraseIntroduction="En %d, les planètes du système solaire étaient au nombre de : %d";
	        int nbPlanetes=0;
	        short annee=2005;
	        if (annee<2006){
	            nbPlanetes=9;
	        }else
	        	 nbPlanetes=8;
	        System.out.printf(phraseIntroduction,annee,nbPlanetes);


	}

}
