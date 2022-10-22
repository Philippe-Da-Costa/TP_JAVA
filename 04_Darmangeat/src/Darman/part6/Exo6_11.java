package Darman.part6;

public class Exo6_11 {
public static void main(String[] args) {
	int[]tab1= {4,8,7,12}, tab2={3,6};
	int schtroumpf=0;
	for(int i=0;i<tab1.length;i++) {
		for(int j=0;j<tab2.length;j++) {
			schtroumpf=schtroumpf+(tab1[i]*tab2[j]);
		}
	}
	System.out.println("le total du schtroumpf est : "+schtroumpf );
}
}
