package accesoTarea3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class ejercicio02 {

	public static void main(String[] args) throws IOException {
		
		// Este programa cuenta las palabras de un archivo de texto
		
		File fichero = new File("C:\\TEMA2\\lorem.txt");
		fichero.createNewFile();
		
		FileReader fr = new FileReader(fichero);
		BufferedReader br = new BufferedReader(fr);
		
		String aux = "";
		String cadena = "";
		
		while((aux = br.readLine())!=null) {
			cadena+=aux;
		}
				
		StringTokenizer st = new StringTokenizer(cadena," ");
		
		int counter = 0;
		
		while(st.hasMoreTokens()) {
			counter++;
			st.nextToken();
		}
		
		System.out.println("El número de palabras en el archivo es: " + counter);

	}

}
