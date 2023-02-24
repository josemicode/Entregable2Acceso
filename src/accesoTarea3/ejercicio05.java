package accesoTarea3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ejercicio05 {

	public static void main(String[] args) throws IOException {
		
		// Este programa lee y escribe en ficheros caracter por caracter simultaneamente, siendo los argumentos los nombres de los archivos origen y destino
		
		File tema2 = new File("C:\\TEMA2");
		tema2.mkdir();
		
		String arg1 = "lorem.txt";
		String arg2 = "fichero2.txt";
		
		File ficheroOrigen = new File(tema2.getPath()+"\\"+arg1);
		ficheroOrigen.createNewFile();
		
		File ficheroDestino= new File(tema2.getPath()+"\\"+arg2);
		ficheroDestino.createNewFile();
		
		FileReader fr = new FileReader(ficheroOrigen);
		FileWriter fw = new FileWriter(ficheroDestino);
				
		int data = fr.read();
		
		while(data!=-1) {
			fw.write(data);
			data = fr.read();
		}
		
		fw.close();
		System.out.println("El fichero ha sido copiado exitosamente");
	}

}
