package StructuresConditionnelles;

public class LeSwitch {

	public static void main(String[] args) {
		int mois=12;
		int saison=12;
		char initiale='c';
		
		switch (mois) {
		case 1: 
			System.out.println("Janvier");
			break;
		case 2: 
			System.out.println("Fevrier");
			break;
		case 3: 
			System.out.println("Mars");
			break;
		case 4: 
			System.out.println("Avril");
			break;
		case 5: 
			System.out.println("Mai");
			break;
		case 6: 
			System.out.println("Juin");
			break;
		case 7: 
			System.out.println("Juillet");
			break;
		case 8: 
			System.out.println("Aout");
			break;
		case 9: 
			System.out.println("Septembre");
			break;
		case 10: 
			System.out.println("Octobre");
			break;
		case 11: 
			System.out.println("Novembre");
			break;
		case 12: 
			System.out.println("Decembre");
			break;
		default:
			System.out.println("ce mois n'existe pas dans le calendrier Grégorien!!");
		}
		
		
		switch (saison) {
		case 1: 
			
		case 2: 
			
		case 3: 
			System.out.println("printemps");
			break;
		case 4: 
			
		case 5: 
			
		case 6: 
			System.out.println("Ete");
			break;
		case 7: 
			
		case 8: 
			
		case 9: 
			System.out.println("Automne");
			break;
		case 10: 
			
		case 11: 
			
		case 12: 
			System.out.println("hiver");
			break;
			
		default:
			System.out.println("hors saison");
		}
		
		switch (initiale) {
		case 'c': 
			System.out.println("Carlos");
			break;
		case 'd': 
			System.out.println("Damien");
			break;
		case 'p': 
			System.out.println("Philippe");
			break;
		case 's': 
			System.out.println("Sandrine");
			break;
		
		default:
			System.out.println("non traité");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
