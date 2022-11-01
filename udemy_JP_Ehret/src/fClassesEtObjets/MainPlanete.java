package fClassesEtObjets;

public class MainPlanete {

	public static void main(String[] args) {
		
		Planete  soleil = new Planete();
		soleil.nom="Soleil";
		soleil.matiere="Gazeuse";
		soleil.diametre= 1_391_000;
		
		Planete  mercure = new Planete();
		mercure.nom="mercure";
		mercure.matiere="tellurique";
		mercure.diametre= 4880;
		
		Planete  venus = new Planete();
		venus.nom="Venus";
		venus.matiere="tellurique";
		venus.diametre= 12_100;
		
		Planete  terre = new Planete();
		terre.nom="Terre";
		terre.matiere="tellurique";
		terre.diametre= 12_100;
		
		Planete  mars = new Planete();
		mars.nom="Mars";
		mars.matiere="tellurique";
		mars.diametre= 6_792;
		
		Planete  jupiter = new Planete();
	    jupiter.nom="Jupiter";
	    jupiter.matiere="Gazeuse";
	    jupiter.diametre=142_984;
	    
		Planete  saturne = new Planete();
		saturne.nom="Saturne";
		saturne.matiere="Gazeuse";
		saturne.diametre= 120_536;
		
		Planete  uranus = new Planete();
		uranus.nom="Uranus";
		uranus.matiere="Gazeuse";
		uranus.diametre= 51_118;
		
		Planete  neptune = new Planete();
		neptune.nom="Neptune";
		neptune.matiere="Gazeuse";
		neptune.diametre= 49_532;
		
		Planete  pluton = new Planete();
		pluton.nom="Pluton";
		pluton.matiere="Gazeuse";
		pluton.diametre= 2_300;
		
		
	
	
	System.out.println(jupiter.nom+" est une planète "+ jupiter.matiere + " avec un diamètre de "+jupiter.diametre+" kilomètres");

	}

}
//Jupiter est une planète Gazeuse avec un diamètre de 142984 kilomètres.