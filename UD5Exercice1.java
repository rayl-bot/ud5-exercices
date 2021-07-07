/*
 *Code by Raúl González Méndez
 *Version of the app (date dd/mm/yyyy): 07/07/2021
 *
 * CONTENT README.txt-->En este ejercicio vamos a realizar ciertos ejercicios que nos serviran para practicar
 * los diferentes flujos que tenemos en java, en mi caso he estructurado los ejercicios modularmente(por funciones)
 * <--CONTENT README.txt
 * */

public class UD5Exercice1 {
	
	/*
	 * Declara 2 variables numéricas (con el valor que desees), he indica cual es mayor de los
	dos. Si son iguales indicarlo también. Ves cambiando los valores para comprobar que
	funciona.
	*/
	
	public static int max(int v1, int v2) {
		if (v1==v2)
			return 0;
		else if(v1>v2)
			return 1;
		else
			return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int v1=34,v2=37;
		if(max(v1,v2)>0)
			System.out.println("Valor 1: "+v1+ " es mayor que Valor 2: "+v2);
		else if(max(v1,v2)<0)
			System.out.println("Valor 2: "+v2+ " es mayor que Valor 1: "+v1);
		else
			System.out.println(v1+" es igual que "+v2);
	}

}
