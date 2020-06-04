/* Este codigo ha sido generado por el modulo psexport 20180802-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo debería llamarse "SIN_TITULO.java."

import java.io.*;

public class sin_titulo {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		double a;
		double acum;
		double i;
		double in;
		double mes;
		double x;
		System.out.println("Ingrese la cantidad de años que desea ahorrar");
		a = Double.parseDouble(bufEntrada.readLine());
		for (x=1;x<=a;x++) {
			for (i=1;i<=12;i++) {
				i = i+i;
				System.out.println("Digita tu deposito del "+" "+i+" "+" mes");
				mes = Double.parseDouble(bufEntrada.readLine());
				acum = acum+mes;
				in = mes*0.1;
				acum = acum+in;
			}
			System.out.println("la cantidad total de inversion de año"+i+" es de"+" "+acum);
		}
	}


}

