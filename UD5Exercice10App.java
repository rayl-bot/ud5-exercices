import javax.swing.JOptionPane;

/*
 *Code by Raúl González Méndez
 *Version of the app (date dd/mm/yyyy): 07/07/2021
 *
 * CONTENT README.txt-->En este ejercicio vamos a realizar ciertos ejercicios que nos serviran para practicar
 * los diferentes flujos que tenemos en java, en mi caso he estructurado los ejercicios modularmente(por funciones)
 * <--CONTENT README.txt
 * */

public class UD5Exercice10App {
	
	/*
	 * Realiza una aplicación que nos pida un número de ventas a introducir, después nos
	pedirá tantas ventas por teclado como número de ventas se hayan indicado. Al final
	mostrara la suma de todas las ventas. Piensa que es lo que se repite y lo que no.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String textRent = JOptionPane.showInputDialog("Introduce la cantidad de ventas: ");
		int rent = Integer.parseInt(textRent);
		int i = 0, total = 0;
		while(i<rent) {
			String textPrice = JOptionPane.showInputDialog("Introduce el precio de la venta: "+(i+1));
			int price = Integer.parseInt(textPrice);
			total+=price;
			i++;
		}
		JOptionPane.showMessageDialog(null, "Precio total: "+total);
	}

}
