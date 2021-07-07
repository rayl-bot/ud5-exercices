/*
 *Code by Raúl González Méndez
 *Version of the app (date dd/mm/yyyy): 07/07/2021
 *
 * CONTENT README.txt-->En este ejercicio vamos a realizar ciertos ejercicios que nos serviran para practicar
 * los diferentes flujos que tenemos en java, en mi caso he estructurado los ejercicios modularmente(por funciones)
 * <--CONTENT README.txt
 * */

public class UD5Exercice9App {
	
	/*
	 * Muestra los números del 1 al 100 (ambos incluidos) divisibles entre 2 y 3. Utiliza el bucle
	que desees.
	 */


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;
		while(i<=100) {
			if (i%2==0 && i%3==0)
				System.out.println(i);
			i++;
		}
	}

}
