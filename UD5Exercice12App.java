import javax.swing.JOptionPane;

/*
 *Code by Raúl González Méndez
 *Version of the app (date dd/mm/yyyy): 07/07/2021
 *
 * CONTENT README.txt-->En este ejercicio vamos a realizar ciertos ejercicios que nos serviran para practicar
 * los diferentes flujos que tenemos en java, en mi caso he estructurado los ejercicios modularmente(por funciones)
 * <--CONTENT README.txt
 * */

public class UD5Exercice12App {
	
	/*
	 * Escribe una aplicación con un String que contenga una contraseña cualquiera. Después
	se te pedirá que introduzcas la contraseña, con 3 intentos. Cuando aciertes ya no pedirá mas
	la contraseña y mostrara un mensaje diciendo “ Enhorabuena”. Piensa bien en la condición
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
