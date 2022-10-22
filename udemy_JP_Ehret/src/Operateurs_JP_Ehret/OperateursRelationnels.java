package Operateurs_JP_Ehret;

import javax.swing.CellEditor;

public class OperateursRelationnels {
//se sont des operateurs qui donnenet un resultat booleen
	public static void main(String[] args) {
		
		//avec valeur
		System.out.println("avec valeur :");
		boolean estCeQUeCestVrai =20<30;
		System.out.println("20 plus petit que 30 : "+estCeQUeCestVrai);
		estCeQUeCestVrai =20>30;
		System.out.println("20 plus grand que 30 : "+estCeQUeCestVrai);
		estCeQUeCestVrai =20==30;
		System.out.println("20 egal a 30 : "+estCeQUeCestVrai);
		estCeQUeCestVrai =20!=30;
		System.out.println("20 egal a 30 : "+estCeQUeCestVrai);
		estCeQUeCestVrai =20<=30;
		System.out.println("20 inferieur ou egal a 30 : "+estCeQUeCestVrai);
		estCeQUeCestVrai =20>=30;
		System.out.println("20 superieur ou egal a 30 : "+estCeQUeCestVrai);
		
		System.out.println();
		//avec variable
		System.out.println("avec variable :");
		int nb1=20;
		int nb2=30;
		estCeQUeCestVrai =nb1<nb2;
		System.out.println("nb1 plus petit que nb2 : "+estCeQUeCestVrai);
		estCeQUeCestVrai =nb1>nb2;
		System.out.println("nb1 plus grand que nb2 : "+estCeQUeCestVrai);
		estCeQUeCestVrai =nb1==nb2;
		System.out.println("nb1 egal a nb2 : "+estCeQUeCestVrai);
		estCeQUeCestVrai =nb1!=nb2;
		System.out.println("nb1 egal a nb2 : "+estCeQUeCestVrai);
		estCeQUeCestVrai =nb1<=nb2;
		System.out.println("nb2 inferieur ou egal a nb2 : "+estCeQUeCestVrai);
		estCeQUeCestVrai =nb1>=nb2;
		System.out.println("nb1 superieur ou egal a nb2 : "+estCeQUeCestVrai);
		
		
		
	}

}
