import javax.swing.JOptionPane;

/*
 *Code by Raúl González Méndez
 *Version of the app (date dd/mm/yyyy): 07/07/2021
 *
 * CONTENT README.txt-->En este ejercicio vamos a realizar ciertos ejercicios que nos serviran para practicar
 * los diferentes flujos que tenemos en java, en mi caso he estructurado los ejercicios modularmente(por funciones)
 * <--CONTENT README.txt
 * */

public class UD5Exercice13App {
	//En este ejercicio he optado por hacer una funci'on a parte en vez de modificar el nombre de la clase.
	
	/*
	 * Crea una aplicación llamada CalculadoraInversa , nos pedirá 2 operandos int ) y un signo
	aritmético ( String ), según este último se realizara la operación correspondiente. Al final
	mostrara el resultado en un cuadro de dialogo.
	 */
	
	public static double calculadoraInversa(int num1, int num2 , String arit) {
		switch (arit) {
		case "+":
			return num1+num2;
		case "-":
			return num1-num2;
		case "*":
			return num1*num2;
		case "/":
			return num1/num2;
		case "^":
			return Math.pow(num1, num2);
		case "%":
			return num1%num2;
		default:
			return 0;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String textNum = JOptionPane.showInputDialog("Introduce un int: ");
		int num1 = Integer.parseInt(textNum);
		textNum = JOptionPane.showInputDialog("Introduce otro int: ");
		int num2 = Integer.parseInt(textNum);
		String textarit = JOptionPane.showInputDialog("Introduce un signo aritmetico: ");
		JOptionPane.showMessageDialog(null,calculadoraInversa(num1,num2,textarit));
	}
	
}
