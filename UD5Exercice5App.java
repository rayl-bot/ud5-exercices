import javax.swing.*;
/*
 *Code by Raúl González Méndez
 *Version of the app (date dd/mm/yyyy): 07/07/2021
 *
 * CONTENT README.txt-->En este ejercicio vamos a realizar ciertos ejercicios que nos serviran para practicar
 * los diferentes flujos que tenemos en java, en mi caso he estructurado los ejercicios modularmente(por funciones)
 * <--CONTENT README.txt
 * */

public class UD5Exercice5App {

	/*
	 * Lee un número por teclado e indica si es divisible entre 2 (resto = 0). Si no
	 * lo es, también debemos indicarlo.
	 */
	//funcion que no hace ver si un numero es divisible o no
	public static boolean divisible2(double num) {
		if (num % 2 == 0)//si un numero es divisible por otro, el modulo entre dicho numero debe ser 0
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String textNum = JOptionPane.showInputDialog("Introduce un número: ");
		double num = Double.parseDouble(textNum);
		if (divisible2(num))//con las condiciones controlamos la salida del metodo que hemos creado arriba
			JOptionPane.showMessageDialog(null, "El número introducido es divisible por dos");
		else
			JOptionPane.showMessageDialog(null, "El número introducido no es divisible por dos");
	}

}
