package Operateurs_JP_Ehret;

public class OperateursLogiques {
public static void main(String[] args) {
	boolean bool1=true;
	boolean bool2=false;
	boolean bool3=true;
	boolean bool4=false;
	
	
	//and ou & 
	System.out.println("& ou AND :");
	//&& plus performant
	boolean estCeVrai=bool1&bool2;
	System.out.println(estCeVrai);
	estCeVrai=bool1&bool3;
	System.out.println(estCeVrai);
	estCeVrai=bool2&bool4;
	System.out.println(estCeVrai);
	
	System.out.println();
	System.out.println( "! ou NEGATION :");
	estCeVrai=!bool1&!bool2;
	System.out.println(estCeVrai);
	estCeVrai=!bool1&bool3;
	System.out.println(estCeVrai);
	estCeVrai=!bool2&!bool4;
	System.out.println(estCeVrai);
	
	//and ou & 
	System.out.println();
	System.out.println("| ou OR:");
	
	estCeVrai=bool1|bool2;
	System.out.println(estCeVrai);
	estCeVrai=bool1|bool3;
	System.out.println(estCeVrai);
	estCeVrai=bool2|bool4;
	System.out.println(estCeVrai);
	
	System.out.println();
	System.out.println( "^ ou XOR :");
	estCeVrai=bool1^bool2;
	System.out.println(estCeVrai);
	estCeVrai=bool1^bool3;
	System.out.println(estCeVrai);
	estCeVrai=bool2^bool4;
	System.out.println(estCeVrai);
	
	
	
	
}
}
