import java.util.Arrays;

public class TriParamsSort {

	public static void main(String[] args) {
		
		Arrays.sort(args);
				//V1
				System.out.println(args[0]);
				System.out.println(args[1]);
				System.out.println(args[2]);
				
				System.out.println();
				System.out.println();
				
				// Avec Foreach
				System.out.println("Utilisation du FOREACH: ");
				for(String el:args)
					System.out.println(el);
				
				System.out.println();
				System.out.println();
				
				//Avec Foreach incrementÃ©
				System.out.println("Avec incrementation i FOREACH");
				int i=0;
				for(String el:args) {
					System.out.println("Argument "+(i+1)+" "+el);
					i++;
					}
				

			}

	}


