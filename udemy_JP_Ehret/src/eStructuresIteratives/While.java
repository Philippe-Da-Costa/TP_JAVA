package eStructuresIteratives;

public class While {

	public static void main(String[] args) {
		
		int i=0;
		
		while ( i<=5) {
			System.out.println("Pas tres utile");
			i++;
			}
		System.out.printf("i vaut: %d",i);
		
		boolean jeContinue=false;
//		boucle infini 
		do{
			System.out.println("toujours nul");
			
			jeContinue=true;
		} while (jeContinue);
		}
	}

	


