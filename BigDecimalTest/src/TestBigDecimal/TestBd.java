package TestBigDecimal;

import java.math.BigDecimal;

import javax.swing.JOptionPane;


public class TestBd {
	static String saisirNb1=JOptionPane.showInputDialog("Saisir nb1");
	static String saisirNb2=JOptionPane.showInputDialog("Saisir nb2");

	public static void main(String[] args) {
		
		multiplier();
		diviser();
		ajouter();
		oter();
		}
	
	public static BigDecimal multiplier() {
		BigDecimal nb1=new BigDecimal(saisirNb1);
		BigDecimal nb2=new BigDecimal(saisirNb2);
		BigDecimal result=nb1.multiply(nb2);
		JOptionPane.showMessageDialog(null,"multiplication "+ nb1 +"x"+ nb2 + " = "+ result);
		return  result;
	}
	
	public static BigDecimal diviser() {
		BigDecimal nb1=new BigDecimal(saisirNb1);
		BigDecimal nb2=new BigDecimal(saisirNb2);
		BigDecimal result=nb1.divide(nb2);
		JOptionPane.showMessageDialog(null, "division "+ nb1 +" : "+ nb2 + " = "+ result);
		return  result;
		}
	
	public static BigDecimal ajouter() {
		BigDecimal nb1=new BigDecimal(saisirNb1);
		BigDecimal nb2=new BigDecimal(saisirNb2);
		BigDecimal result=nb1.add(nb2);
		JOptionPane.showMessageDialog(null, "addition "+ nb1 +"+"+ nb2 + " = "+ result);
		return  result;
	}
	public static BigDecimal oter() {
		BigDecimal nb1=new BigDecimal(saisirNb1);
		BigDecimal nb2=new BigDecimal(saisirNb2);
		BigDecimal result=nb1.subtract(nb2);
		JOptionPane.showMessageDialog(null, "soustraction "+ nb1 +"-"+ nb2 + " = "+ result);
		return  result;
	}
	public static BigDecimal oter() {
		BigDecimal nb1=new BigDecimal(saisirNb1);
		BigDecimal nb2=new BigDecimal(saisirNb2);
		BigDecimal result=nb1.;
		JOptionPane.showMessageDialog(null, "soustraction "+ nb1 +"-"+ nb2 + " = "+ result);
		return  result;
	}

}


