package fr.afpa.util;

import java.math.BigDecimal;
import java.util.Scanner;

import javax.swing.JOptionPane;

import fr.afpa.math.Math;

public class Convertisseur {
	        //mes variables
	    public static Scanner scanner = new Scanner(System.in);
	    public static BigDecimal convert;
	    public static String choice;
	    public static String value;
	    
	    public static void main(String[] args) {
	    	do {
	            choice = JOptionPane.showInputDialog("Convertir en Dollar $ (Taper 1) ou convertir en  Euros € (Taper 2)");

	            if (choice != null) {
	                long choix = Long.parseLong(choice);

	                if (choix != 1 && choix != 2) {
	                    JOptionPane.showMessageDialog(null, "Je n'ai pas compris votre choix");

	                } else if (choix == 1) {

	                    value = JOptionPane
	                            .showInputDialog("Veuillez saisir la valeur en Euro € a convertir en Dollar $");

	                    BigDecimal test = new BigDecimal(value);

	                    convert = Math.euroToDollar(test);

	                    JOptionPane.showMessageDialog(null, "La valeur en dollars est de " + convert + " $");

	                } else if (choix == 2) {

	                    value = JOptionPane
	                            .showInputDialog("Veuillez saisir la valeur en Dollar $ a convertir en Euro €");

	                    BigDecimal test = new BigDecimal(value);

	                    convert = Math.dollarToEuro(test);

	                    JOptionPane.showMessageDialog(null, "La valeur en euros est de " + convert + " € ");

	                }

	            }

	        } while (choice != null);

	        System.exit(0);
}}
