package cStructuresConditionnelles;

public class LeCasPlutonV5JPEhret {

	public static void main(String[] args) {
		String phraseIntroduction ="En %d, les planètes du système solaire etait au nombre de : %d";
		int nbPlanete=0;
		short annee=2003;
		
		if (annee<2006) {
			nbPlanete=9;
		}
		if (annee>=2006) {
			nbPlanete=8;
		}
		System.out.printf(phraseIntroduction,annee,nbPlanete);

	}

}
