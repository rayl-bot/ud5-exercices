import javax.swing.*;

/*
 *Code by Raúl González Méndez
 *Version of the app (date dd/mm/yyyy): 07/07/2021
 *
 * CONTENT README.txt-->En este ejercicio vamos a realizar ciertos ejercicios que nos serviran para practicar
 * los diferentes flujos que tenemos en java, en mi caso he estructurado los ejercicios modularmente(por funciones)
 * <--CONTENT README.txt
 * */

public class UD5Exercice4App {
	
	/*
	 * Haz una aplicación que calcule el área de un circulo (pi*R 2 ). El radio se pedirá por teclado
	(recuerda pasar de String a double con Double.parseDouble ). Usa la constante PI y el
	método pow de Math
	*/
	
	public static double calcArea(double radio) {
		radio =  Math.pow(radio, 2);
		return Math.PI*radio;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String textRadio = JOptionPane.showInputDialog("Introduce el radio del círculo: ");
		double radio = Double.parseDouble(textRadio);
		JOptionPane.showMessageDialog(null, "El area del circulo es: "+calcArea(radio));
	}
}
