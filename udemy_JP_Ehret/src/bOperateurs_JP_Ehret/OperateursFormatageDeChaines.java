package bOperateurs_JP_Ehret;

public class OperateursFormatageDeChaines {

	public static void main(String[] args) {
		
		String debut ="Mon age est : ";
		int age = 51;
		String fin =" ans .";
		
		System.out.println("Moins lisible et moins performant des que l on utilisent plusieus variables Java utilise des variables intermediaires \nafin de permettre l affichage donc plus de memoires.");
		System.out.println(debut+age+fin);
		System.out.println(); 
		System.out.println("Untilisons printf() Qui permet le formatage de mes chaines");
		System.out.printf("\"Mon age est : %d ans.",age);
		System.out.println();
		System.out.println();
		System.out.println("%d pour afficher les decimales \n %s pour afficher les string \n %f pour afficher les float %bpour afficher les booleens");
	}

}
