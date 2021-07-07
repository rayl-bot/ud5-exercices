import javax.swing.*;
/*
 *Code by Ra�l Gonz�lez M�ndez
 *Version of the app (date dd/mm/yyyy): 07/07/2021
 *
 * CONTENT README.txt-->En este ejercicio vamos a realizar ciertos ejercicios que nos serviran para practicar
 * los diferentes flujos que tenemos en java, en mi caso he estructurado los ejercicios modularmente(por funciones)
 * <--CONTENT README.txt
 * */

public class UD5Exercice5App {

	/*
	 * Lee un n�mero por teclado e indica si es divisible entre 2 (resto = 0). Si no
	 * lo es, tambi�n debemos indicarlo.
	 */

	public static boolean divisible2(double num) {
		if (num % 2 == 0)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String textNum = JOptionPane.showInputDialog("Introduce un n�mero: ");
		double num = Double.parseDouble(textNum);
		if (divisible2(num))
			JOptionPane.showMessageDialog(null, "El n�mero introducido es divisible por dos");
		else
			JOptionPane.showMessageDialog(null, "El n�mero introducido no es divisible por dos");
	}

}
