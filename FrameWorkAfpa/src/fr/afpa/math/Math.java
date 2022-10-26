package fr.afpa.math;

public class Math {
	// Declaration de mes variables:
	static long resultat = 1;

	// signatures de mes méthodes:
	public static long factorielleFor(long nb) {
		if (nb < 0) {
			return -1;
		} else if (nb == 0) {
			return 1;
		} else if (nb == 1) {
			return 1;
		} else if (nb > 20) {
			return -2;
		} else {
			for (int i = 1; i <= nb; i++) {
				resultat = resultat * i;
			}
		}
		return resultat;
	}

	public static long factorielle(long nb) {
		// x! =x*(x-1)!

		if (nb < 0) {

			return -1;

		} else if (nb == 0) {
			return 1;
		} else if (nb == 1) {
			return 1;
		} else if (nb > 20) {
			return -2;
		} else {
			return nb * factorielle(nb - 1);
		}
	}
}
