package Darman.part3;
import java.util.Scanner;
public class Exo3_03 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String name1, name2, name3;
	
	System.out.println("Saisir un premier nom SVP");
    name1 = sc.nextLine();
    
    System.out.println("Saisir un second nom SVP");
    name2 = sc.nextLine();
    
    System.out.println("Saisir un troiseieme nom SVP");
    name3 = sc.nextLine();
    //System.out.printf("nom 1 = %S \nnom 2 = %s \nnom 3 = %s   ", name1 ,name2 ,name3  );
    
    if(name1.compareToIgnoreCase(name2)<0 && name2.compareToIgnoreCase(name3)<0) { 
    	System.out.print("c est dans l ordre alphabetique"); }else
    	{System.out.print("ce n est pasdans l ordre alphabetique");}
    
    
}
}