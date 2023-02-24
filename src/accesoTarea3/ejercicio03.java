package accesoTarea3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class ejercicio03 {

	public static void main(String[] args) throws IOException {
		
		// Este programa muestra las iniciales de cada palabra de un texto en un fichero determinado
		
		File fichero = new File("C:\\TEMA2\\lorem.txt");
		fichero.createNewFile();
		
		FileReader fr = new FileReader(fichero);
		BufferedReader br = new BufferedReader(fr);
		
		String aux = "";
		String cadena = "";
		
		while((aux = br.readLine())!=null) {
			cadena+=aux;
		}
		
		
		StringTokenizer st = new StringTokenizer(cadena);
		
		String iniciales = "";
		String aux2 = " ";
		
		while(st.hasMoreTokens()) {
			
			if(aux2.equals(" ")) {
				iniciales += (st.nextToken(" ").charAt(0) + " ");
			}else {
				aux2 = st.nextToken();
			}
			
		}
		
		System.out.println("Aquí están las iniciales de cada palabra del fichero: \n" + iniciales);
	}

}
