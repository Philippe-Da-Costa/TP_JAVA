

public class MultiplesV1 {
	 static final int nbDiv=7;
	 public static void main(String[] args) {
		System.out.println("Affichage des MULTIPLES de: "+nbDiv+ " entre 0 et 100\n");
		
		for(int x=0;x<=100;x++) {
			if(x % nbDiv==0) {
				System.out.println("("+x+")\t" );
			}else {
				System.out.println(""+x+"\t" );
			}
		}
		
		}
	 }
