package StructuresConditionnelles;

public class Ternaire {
public static void main(String[] args) {
	int monAge=45;
	System.out.printf("mon age est : %d ans",monAge);
	if (monAge>=30) {
		System.out.println("\nOui, je parait plus jeune");
	}
	
	int ageDuCapitaine=15;
	System.out.println(ageDuCapitaine>20 && monAge<50 ?  "L'age du capitaine est "+ ageDuCapitaine : "Ce code ne premet pas d'afficher l'age du capitaine pour des raisons farfelues");
	

}
}
