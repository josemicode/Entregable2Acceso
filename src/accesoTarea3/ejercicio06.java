package accesoTarea3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ejercicio06 {

	public static void main(String[] args) throws IOException {
		
		// Este programa muestra un archivo de texto por pantallas pasables de 23 lineas cada una, cada linea teniendo 80 caracteres
		
		File fichero = new File("fichero3.txt");
		
		FileReader fr = new FileReader(fichero);
		
		Scanner sc = new Scanner(System.in);
		
		int data = fr.read();
		char aux = (char)data;
		
		while(data!=-1) {
			for(int j = 0; j < 23; j++) {
			
				for(int i = 0; i < 80; i++) {
					if(data!=-1) {
						System.out.print(aux);
						data = fr.read();
						aux=(char)data;
					}else {
						break;
					}	
				}
				if(data==-1) {
					break;
				}
				System.out.println();
			}
			System.out.println("\n\nPresiona cualquier tecla para continuar\n\n");
			sc.next();
		}

		
	}

}
