package Darman.part3;
import java.util.Scanner;
public class Exo3_06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int age;
		System.out.print("saisir l'age de l'enfant SVP ");
		age=sc.nextInt();
		
		if (age>=12) {
			System.out.println("Cat�gorie Cadet");
		}else if(age >=10) {
			System.out.println("Cat�gorie Minime");
		}else if (age >=8){
			System.out.println("Cat�gorie Pupille");
		}else if (age >=6) {
			System.out.println("Cat�gorie Poussin");
		}else {
			System.out.println("Trop jeune !!!!");
	}
	}
}
