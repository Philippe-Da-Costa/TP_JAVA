package Darman.part6;

public class Exo6_09 {

	public static void main(String[] args) {
	int []tableau = {2, 4, 6, 8, 10, 12, 13, 14, 16,20};
	int sommeTableau=0;
	
	for(Integer el:tableau)
		{sommeTableau=sommeTableau+el;}
	System.out.println("Total des valeurs "+sommeTableau);
	
}}
