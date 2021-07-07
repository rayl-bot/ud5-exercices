import javax.swing.*;
/*
 *Code by Raúl González Méndez
 *Version of the app (date dd/mm/yyyy): 07/07/2021
 *
 * CONTENT README.txt-->En este ejercicio vamos a realizar ciertos ejercicios que nos serviran para practicar
 * los diferentes flujos que tenemos en java, en mi caso he estructurado los ejercicios modularmente(por funciones)
 * <--CONTENT README.txt
 * */

public class UD5Exercice6App {
	
	public static final double IVA = 0.21;
	
	/*
	 * Lee un número por teclado que pida el precio de un producto (puede tener decimales) y
	calcule el precio final con IVA. El IVA sera una constante que sera del 21%
	 */
	
	public static double priceIVA(double price) {
		return price+(price*IVA);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String textPrice = JOptionPane.showInputDialog("Introduce un precio: ");
		double price = Double.parseDouble(textPrice);
		JOptionPane.showMessageDialog(null, "Precio total: "+priceIVA(price));
	}

}
