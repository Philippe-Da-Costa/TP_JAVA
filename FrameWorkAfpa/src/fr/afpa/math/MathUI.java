package fr.afpa.math;
import javax.swing.JOptionPane;


public class MathUI {
	
	static String  saisie =null;

	public static void main(String[] args) {
		
		
		do {
			saisie = JOptionPane.showInputDialog("Saisir la valeur a factorisée");
			if(saisie !=null) {
				long nb=Long.parseLong(saisie);
				long FactNb = Math.factorielle(nb);
				if (FactNb<0) {
					JOptionPane.showMessageDialog(null,"Resultat impossible pour ce nombre "+ nb);
				} else {
					JOptionPane.showMessageDialog(null, nb+"! vaut "+ FactNb);
				}
				
			}
		}while(saisie != null);
			}

}
