package fr.afpa.util;

import java.math.BigDecimal;
import java.util.Scanner;

import javax.swing.JOptionPane;

import fr.afpa.math.Math;

public class Convertisseur {
	 public static Scanner scanner = new Scanner(System.in);
	    public static BigDecimal val;
	    public static BigDecimal conVal;
	    public static String saisie1;
	    public static String saisie2;

	    public static void main(String[] args) {
	        ///////////////////// AVEC JOPTIONPANE /////////////////

	        do {
	            saisie1 = JOptionPane.showInputDialog("Convertir en Dollar $ (Taper 1) ou convertir en  Euros € (Taper 2)");

	            if (saisie1 != null) {
	                long choix = Long.parseLong(saisie1);

	                if (choix != 1 && choix != 2) {
	                    JOptionPane.showMessageDialog(null, "Je n'ai pas compris votre choix");

	                } else if (choix == 1) {

	                    saisie2 = JOptionPane
	                            .showInputDialog("Veuillez saisir la valeur en Euro € a convertir en Dollar $");

	                    BigDecimal test = new BigDecimal(saisie2);

	                    conVal = Math.euroToDollar(test);

	                    JOptionPane.showMessageDialog(null, "La valeur en dollars est de " + conVal + " $");

	                } else if (choix == 2) {

	                    saisie2 = JOptionPane
	                            .showInputDialog("Veuillez saisir la valeur en Dollar $ a convertir en Euro €");

	                    BigDecimal test = new BigDecimal(saisie2);

	                    conVal = Math.dollarToEuro(test);

	                    JOptionPane.showMessageDialog(null, "La valeur en euros est de " + conVal + " € ");

	                }

	            }

	        } while (saisie1 != null);

	        System.exit(0);
}}
