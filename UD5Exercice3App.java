import javax.swing.*;
/*
 *Code by Raúl González Méndez
 *Version of the app (date dd/mm/yyyy): 07/07/2021
 *
 * CONTENT README.txt-->En este ejercicio vamos a realizar ciertos ejercicios que nos serviran para practicar
 * los diferentes flujos que tenemos en java, en mi caso he estructurado los ejercicios modularmente(por funciones)
 * <--CONTENT README.txt
 * */

public class UD5Exercice3App {
	
	/*
	 * DModifica la aplicación anterior, para que nos pida el nombre que queremos introducir
	(recuerda usar JOptionPane
	*/
	
	public static void bienvenida(String name) {
		JOptionPane.showMessageDialog(null, "Bienvenid@ "+name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = JOptionPane.showInputDialog("Introduce tu nombre");
		bienvenida(name);
	}

}
