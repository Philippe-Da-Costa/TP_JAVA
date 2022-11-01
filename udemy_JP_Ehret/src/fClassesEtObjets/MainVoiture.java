package fClassesEtObjets;

public class MainVoiture {

	public static void main(String[] args) {
		Voiture voitureDeMichel = new Voiture();
		//affecter nouvel valeur
		voitureDeMichel.nbPortes=3;
		voitureDeMichel.automatique=true;
		voitureDeMichel.couleur="verte";
		
		System.out.printf("la voiture de Michel est %s et a  %d portes" 
				,voitureDeMichel.couleur, voitureDeMichel.nbPortes);
		

	}

}
