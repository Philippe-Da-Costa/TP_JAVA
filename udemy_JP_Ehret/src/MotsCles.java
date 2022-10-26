
public class MotsCles {

	public static void main(String[] args) {
		boolean jeContinue=true;
		int nb =0;
		while(jeContinue) {
			System.out.println("Ca sert a tester le break");
			break;
		}
		
		
		//cas avec continue
		
		while(jeContinue) {
			System.out.println("Ca sert a tester le continue");
			nb++;
			if (nb==5) {
				continue;
			}
			System.out.println("nb ne vaut pas 5");
			if(nb==10) {
				break;
			}
			
		}
	
	
	
	}

}
