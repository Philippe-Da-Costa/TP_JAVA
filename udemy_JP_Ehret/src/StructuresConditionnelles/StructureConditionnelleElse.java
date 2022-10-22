package StructuresConditionnelles;

public class StructureConditionnelleElse {

	public static void main(String[] args) {
		int monAge=35;
		System.out.printf("mon age est : %d ans",monAge);
		if (monAge>=30) {
			System.out.println("\nOui, je parait plus jeune");
		}
		
		int ageDuCapitaine=25;
		if (ageDuCapitaine>20 && monAge<50) {
			System.out.printf("\nL'age du capitaine est : %d ans",ageDuCapitaine);
		}else  {
			System.out.println("\nCe code ne premet pas d'afficher l'age du capitaine pour des raisons farfelues");
		}

	}

}
