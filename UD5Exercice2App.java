/*
 *Code by Raúl González Méndez
 *Version of the app (date dd/mm/yyyy): 07/07/2021
 *
 * CONTENT README.txt-->En este ejercicio vamos a realizar ciertos ejercicios que nos serviran para practicar
 * los diferentes flujos que tenemos en java, en mi caso he estructurado los ejercicios modularmente(por funciones)
 * <--CONTENT README.txt
 * */

public class UD5Exercice2App {
	
	/*
	 * Declara un String que contenga tu nombre, después muestra un mensaje de bienvenida
	por consola. Por ejemplo: si introduzco
	*/
	
	public static void bienvenida(String name) {
		// Show on screen
		System.out.println("Bienvenid@ "+name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "Raul";
		bienvenida(name);
	}

}
