package Darman.part6;
import java.util.Arrays;
import java.util.Scanner;

public class Exo6_08 {
public static void main(String[] args) {
	Scanner sc =  new Scanner(System.in);
	int Nb, Nbpos=0, Nbneg=0 ;
	
	System.out.println("Entrez le nombre de valeurs :");
	Nb=sc.nextInt();
	int[]T= new int[Nb];
	for(int i=0;i<Nb;i++) {
		System.out.printf("valeur %d",i+1);
		T[i]=sc.nextInt();
		if(T[i]>=0)Nbpos++;
		else if (T[i]<0)Nbneg++;
	}
	System.out.printf("T=%s\n",Arrays.toString(T));
	System.out.printf("Tu as saisi %d valeurs nulles ou positives et %d valeurs negatives",Nbpos, Nbneg);
	
	
}
}
