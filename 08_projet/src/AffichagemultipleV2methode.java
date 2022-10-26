import java.util.Scanner;

public class AffichagemultipleV2methode {
	
	static Scanner sc = new Scanner(System.in);

	static int nbDiv;
	static int nbMin;
	static int nbMax;
	static String rep = "";

	public static void main(String[] args) {
		
		do {
			afficherQuestion();
			calculer();
		    rep = response();
			
		} while (rep.equalsIgnoreCase("o"));

	}



	public static void afficherQuestion() {
		
		System.out.println("Saisir la valeur mini");
		nbMin = sc.nextInt();
		System.out.println("Saisir la valeur max");
		nbMax = sc.nextInt();
		System.out.println("Saisir la valeurdu nbDiv");
		nbDiv = sc.nextInt();
		System.out.println("Affichage des MULTIPLES de: " + nbDiv + " entre " + nbMin + " et " + nbMax);
		sc.nextLine();

	}

	public static void calculer() {

		for (int i = nbMin; i <= nbMax; i++) {
			if (i % nbDiv == 0) {
				System.out.println("(" + i + ")\t");
			} else {
				System.out.println("" + i + "\t");
			}
		}
	}
	
	private static String response() {
		
		String rep = "";
		do {
			System.out.println("voulez vous continuer ? o/n");
			rep = sc.nextLine();
			
			if (rep.equalsIgnoreCase("o")) {
			System.out.println("On continue");
			break;
			
		} else if (rep.equalsIgnoreCase("n")) {
			System.out.println("On stop");
			break;
			
		}
		} while (!rep.equalsIgnoreCase("o") || !rep.equalsIgnoreCase("n"));
		
		return rep;
	
		
	}

}
