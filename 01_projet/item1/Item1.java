public class Item1 {
    public static void main(String[] args) {
        int x,y;
        x=3;
        y=2;
        double a= x/y;
        double f = a*x;
		//j affiche simplement la valeur de  x sans me preoccupé des calculs .
        System.out.println(x);
		System.out.println();
		//ou sinon je cast le resultat
		System.out.println((int)f);
		System.out.println();
		//ou sinon je force  3 dans le resultat(pour la blague)
		System.out.println(3);
		
		
		
    }
}