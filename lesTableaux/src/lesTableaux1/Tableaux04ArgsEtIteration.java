package lesTableaux1;

public class Tableaux04ArgsEtIteration {

	public static void main(String[] args) {
		int i = 0;
		for(String el:args) {
			System.out.println("arguments:"+(i+1)+" "+el);
		i++;}

	}

}
