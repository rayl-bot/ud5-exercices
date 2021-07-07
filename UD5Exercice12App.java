import javax.swing.JOptionPane;

/*
 *Code by Ra�l Gonz�lez M�ndez
 *Version of the app (date dd/mm/yyyy): 07/07/2021
 *
 * CONTENT README.txt-->En este ejercicio vamos a realizar ciertos ejercicios que nos serviran para practicar
 * los diferentes flujos que tenemos en java, en mi caso he estructurado los ejercicios modularmente(por funciones)
 * <--CONTENT README.txt
 * */

public class UD5Exercice12App {
	
	/*
	 * Escribe una aplicaci�n con un String que contenga una contrase�a cualquiera. Despu�s
	se te pedir� que introduzcas la contrase�a, con 3 intentos. Cuando aciertes ya no pedir� mas
	la contrase�a y mostrara un mensaje diciendo � Enhorabuena�. Piensa bien en la condici�n
	de salida (3 intentos y si acierta sale, aunque le queden intentos).
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean correct=false;
		String password = "password";
		int i = 0;
		do {
			i++;
			String passw = JOptionPane.showInputDialog("Introduce el password correcto: ");
			if (password.equalsIgnoreCase(passw))
				correct = true;
		} while (i<3 && !correct);
		if(correct)
			JOptionPane.showMessageDialog(null, "Enhorabuena");
		else
			JOptionPane.showMessageDialog(null, "Has fallado demasiado");
	}

}
