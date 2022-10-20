package SyntaxeDeBase;import javax.swing.text.AbstractDocument.LeafElement;

public class ATypesEntier {

	public static void main(String[] args) {
		int counter = 10;
		System.out.println(counter); // int = integer
		
		counter ++;  //increment +1
		System.out.println("increment : "+counter); 
		
		counter --;  //decrement -1
		System.out.println("decrement : "+counter); 
		
		// les types entiers
		
		//byte    codé  sur 1 octets  -> -128   a  + 127
		byte monOctet =100;
		// byte  monOctet =128;   !!!on sort des  intervalles autorisés
		System.out.println("byte : "+monOctet); 
		
		// short  codé sur 2 octets ->-32768 a   +23767
		short monShort = 32767;
		//short monShort=32768;    !!! on sort des  intervalles autorisés
		System.out.println("short : "+monShort); 
		
		// int   codé sur 4 octets ->-32768 a   +23767
		int monInt = 1_000_000;
		//int monShort=1_000_000_000    !!! on sort des  intervalles autorisés
		System.out.println("int : "+monInt); 
		
		// long   codé sur 8 octets  ->-tres long
		long monLong = 19_455_255_500L;   //je type avec "L" ou "l" afin de forcer on prefere "L"
		System.out.println("long : "+monLong); 
		
		System.out.println(); 
		
		System.out.println(" 4 bases numeriques"); 
		//******************************************//
		//            4 bases numeriques 
		//******************************************//
		System.out.println(); 
		
		int decimaleValue =10;   // 10 digits 0 a 9
		System.out.println("decimale  : "+decimaleValue); 
		
		int binaryValue = 0b1010;   // 2 digits 0 a 1
		System.out.println("binaire 0b1010  : "+binaryValue); 
		
		int octalValue = 010;   // 8 digits 0 a 7
		System.out.println("octale 010  : "+ octalValue); 
		
		int hexalValue = 0xff;   // 16 digits 0 a F
		System.out.println("octale 0xff  : "+ hexalValue);
		
		System.out.println(); 
		System.out.println(" les opérateurs sur les valeurs entieres"); 
		
		//***************************************************************************************//
		//            les opérateurs   sur les valeurs entieres :  ++ --    +-*/   += -= *= /= %=     
		//***************************************************************************************//
		System.out.println(); 
		int nb1 = 33;
		int nb2 = 44;
		int nb3 = 5;
		int nb4 = 3;
		int resultAdd = nb1 + nb2;
		System.out.println( "voici le resultat de l'addition : " +resultAdd);
		int resultMoins = nb1 - nb2;
		System.out.println( "voici le resultat de la soustraction : " +resultMoins);
		int resultMult = nb3 * nb4;
		System.out.println( "voici le resultat de la multiplication : " +resultMult);
		int resultDiv = nb3 / nb4;
		System.out.println( "voici le resultat de la division sur des entiers INT  : " +resultDiv);  // !!int entier 
		int resultModulo = nb3 % nb4;
		System.out.println( "voici le resultat du modulo (restes s=de la division) : " +resultModulo);  // !!int entier 
		System.out.println();
		
		//***************************************************************************************//
		//            les opérateurs  petits pieges a eviter!!!    
		//***************************************************************************************//
		System.out.println("les opérateurs  petits pieges a eviter");
		System.out.println();
		byte b1 =100;
		byte b2 =100;
		//byte sum = b1 + b2 ; //!! al a plage memoire
		int sum = b1 + b2 ;
		System.out.println( "voici le resultat  : " +sum); 
		
		
		System.out.println();
		System.out.println("astuces");
		System.out.println();
		int currentValue = 1;
		currentValue +=5; // currentValue = currentValue+5;
		System.out.println( "voici le resultat add   : " +currentValue); 
		
		int currentValue1 = 1;
		currentValue1 -=5; // currentValue = currentValue-5;
		System.out.println( "voici le resultat sous  : " + currentValue1);
		
		int currentValue2 = 1;
		currentValue2 *=5; // currentValue = currentValue*5;
		System.out.println( "voici le resultat mult   : " + currentValue2); 
		
		int currentValue3 = 1;
		currentValue3  /=5; // currentValue = currentValue/5;
		System.out.println( "voici le resultat div   : " + currentValue3); 
		
		int currentValue4 = 1;
		currentValue3  %=5; // currentValue = currentValue%5;
		System.out.println( "voici le resultat  mod : " + currentValue4); 
		
		
	}
	}


