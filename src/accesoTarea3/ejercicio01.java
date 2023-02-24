package accesoTarea3;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Array;

public class ejercicio01 {

	public static void main(String[] args) throws IOException {
		
		// Este programa pretende contar las vocales de cada tipo de un texto en un fichero
		
		File tema2 = new File("C:\\TEMA2");
		tema2.mkdir();
		
		File fichero = new File(tema2.getPath()+"\\lorem.txt");
		fichero.createNewFile();
		
		String texto = ("Lorem Ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore\n"
				+ "et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation hue ullamco laboris nisi ut\n"
				+ "aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in chinchong voluptate velit esse\n"
				+ "cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa\n"
				+ "qui officia deserunt ahorium ehemonioho mollit anim id est laborum.");
		
		FileWriter fw = new FileWriter(fichero);
		fw.write(texto);
		fw.close();
		
		FileReader fr = new FileReader(fichero);
		
		int data = fr.read();
		int[] charArray = new int[5];
		
		while(data!=-1) {
			
			if(String.valueOf((char)data).equalsIgnoreCase("A")) {
				charArray[0]+=1;
			}else if(String.valueOf((char)data).equalsIgnoreCase("E")) {
				charArray[1]+=1;
			}else if(String.valueOf((char)data).equalsIgnoreCase("I")) {
				charArray[2]+=1;
			}else if(String.valueOf((char)data).equalsIgnoreCase("O")) {
				charArray[3]+=1;
			}else if(String.valueOf((char)data).equalsIgnoreCase("U")) {
				charArray[4]+=1;
			}
			
			data = fr.read();
		}
		
		System.out.println("[Cantidad de cada vocal]\n"
				+ "A: " +charArray[0] + "\n"
				+ "E: " +charArray[1] + "\n"
				+ "I: " +charArray[2] + "\n"
				+ "O: " +charArray[3] + "\n"
				+ "U: " +charArray[4]);
	}

}
