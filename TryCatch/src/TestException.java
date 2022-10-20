// une exception est une erreur produite durant l'exécution de votre programme. 
// Sémantiquement parlant, le terme d'exception a été retenue car une erreur est censée être exceptionnelle : 
// c'est n'est pas le mode de fonctionnement nominale de votre application. 

public class TestException {
	public static void method3() {
        System.out.println( "BEGIN method3" );
        int divisor = (int) (Math.random() * 3);
        int value = 1 / divisor;
        System.out.println( "Value == " + value );
        System.out.println( "END method3" );
    }

    public static void method2() {
        System.out.println( "BEGIN method2" );
        try {
        	method3();
       	 //Exception contient ArithmeticException
       }catch (Exception e)  {  //(ArithmeticException e ) serait plus precis
			e.printStackTrace();
		}
        System.out.println( "END method2" );
    }
    
    public static void method1() {
        System.out.println( "BEGIN method1" );
        method2();
        System.out.println( "END method1" );
    }

    public static void main(String[] args) {
        System.out.println( "BEGIN main" );
        method1();
        //L execution du programme continue et affichera la suite .
        //pour l exemple "END main" s affichera
        System.out.println( "END main" );
    }

}
