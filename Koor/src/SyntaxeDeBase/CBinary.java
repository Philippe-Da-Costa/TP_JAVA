package SyntaxeDeBase;

public class CBinary {
public static void main(String[] args) {
	for (int i=0;i<=255;i++) {
		String str =Integer.toBinaryString(i);
		//on format afin d afficher un demi octet
		while(str.length()<8)str="0"+str;
		System.out.println(str+" en decimal "+ (str.valueOf(i)));
		}
	System.out.println();
	System.out.println("Autres exemples");
	
	int value1=0b10101010;
	int value2=0b00001111;
	

	
	//Operateurs binaires 
	// & (AND ), |(OR), ^(XOR), ~(NOT)//System.out.println("NOT - " + Integer.toBinaryString (~value1));)
	System.out.println("AND - " + Integer.toBinaryString (value1 & value2));
	System.out.println(" OR - " + Integer.toBinaryString (value1 | value2));
	System.out.println("XOR - " + Integer.toBinaryString (value1 ^ value2));
	System.out.println("NOT - " + Integer.toBinaryString(~value1));
	
	System.out.println();
	System.out.println("Autres exemples");
	
	//<<(left shift )    >> (right shift )
	System.out.println("<< - " + Integer.toBinaryString (value2<<2));
	System.out.println("<< - " + Integer.toBinaryString (value2>>2));
	
	
}
}
