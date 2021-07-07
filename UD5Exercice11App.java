import javax.swing.JOptionPane;

/*
 *Code by Raúl González Méndez
 *Version of the app (date dd/mm/yyyy): 07/07/2021
 *
 * CONTENT README.txt-->En este ejercicio vamos a realizar ciertos ejercicios que nos serviran para practicar
 * los diferentes flujos que tenemos en java, en mi caso he estructurado los ejercicios modularmente(por funciones)
 * <--CONTENT README.txt
 * */

public class UD5Exercice11App {

	/*
	 * Crea una aplicación que nos pida un día de la semana y que nos diga si es un
	 * día laboral o no. Usa un switch para ello.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String day = JOptionPane.showInputDialog("Introduce un dia de la semana (sin acentos): ");
		switch (day.toUpperCase()) {
		case "LUNES":
			JOptionPane.showMessageDialog(null, "Es laborable");
			break;
		case "MARTES":
			JOptionPane.showMessageDialog(null, "Es laborable");
			break;
		case "MIERCOLES":
			JOptionPane.showMessageDialog(null, "Es laborable");
			break;
		case "JUEVES":
			JOptionPane.showMessageDialog(null, "Es laborable");
			break;
		case "VIERNES":
			JOptionPane.showMessageDialog(null, "Es laborable");
			break;
		case "SABADO":
			JOptionPane.showMessageDialog(null, "No es laborable");
			break;
		case "DOMINGO":
			JOptionPane.showMessageDialog(null, "No es laborable");
			break;
		default:
			JOptionPane.showMessageDialog(null, "No se ha introducido un dia valido");
			break;
		}
	}

}
