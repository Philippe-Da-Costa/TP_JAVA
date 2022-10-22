package Operateurs_JP_Ehret;

public class OperateursIncementationDecrementation {

	public static void main(String[] args) {
		
		
		int valEntieres=5;
		System.out.println(" incrementation classique");
		System.out.println(valEntieres+1);//resultat 5+1 = 6
		valEntieres=5;//reinitiialise a 5
		valEntieres++;//resultat  5+1 = 6
		System.out.println("avec++ increùmentation");
		System.out.println(valEntieres);
		
		System.out.println();
		System.out.println("Decrementation classique");
		valEntieres=5;//reinitiialise a 5
		System.out.println(valEntieres-1);//resultat 6-1=5
		valEntieres=5;//reinitiialise a 5
		valEntieres--;//resultat 6-1=5
		System.out.println("avec++ increùmentation");
		System.out.println(valEntieres);
		
		System.out.println();
		System.out.println("Attention au sens !!");
		int valEntieres2=10;//reinitiialise a 10
		int valEntieres3;//reinitiialise a null
		
		System.out.println("preIncrementation ++ devant");
		valEntieres3=++valEntieres2;
		System.out.println(valEntieres3);
		
		 valEntieres2=10;//reinitiialise a 10
		 valEntieres3=0;//reinitiialise a null
		
		System.out.println("preIncrementation ++ derriere");
		valEntieres3=valEntieres2++;//le egale est prioritaire 
		System.out.println(valEntieres3);
		
		
		System.out.println("meme regle pour la post decrementattion!!!");
		
		


	}

}
