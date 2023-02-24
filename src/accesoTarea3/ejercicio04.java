package accesoTarea3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class ejercicio04 {

	public static void main(String[] args) throws IOException {
		
		// Este programa cuenta las haches intercaladas totales del fichero y además las palabras que tienen alguna hache intercalada, no contándose si empiezan por hache o esta va precedida de una "c"
		
		
		File fichero = new File("C:\\TEMA2\\lorem.txt");
		fichero.createNewFile();
		
		FileReader fr = new FileReader(fichero);
		BufferedReader br = new BufferedReader(fr);
		
		String aux = "";
		String cadena = "";
		
		while((aux = br.readLine())!=null) {
			cadena+=aux;
		}
		
		System.out.println("El número de palabras con alguna hache intercalada es el siguiente:");
		Hpalabras(cadena);
		System.out.println("\nEl número de haches intercaladas es este:");
		Hintercal(cadena);
		
	}

	private static void Hintercal(String cadena) {
		
		StringTokenizer st = new StringTokenizer(cadena);
		List<String> wordArray = new ArrayList<>();
		
		int counter = 0;
		String aux = "";
		
		
		while(st.hasMoreTokens()) {
			wordArray.add(st.nextToken());
		}
		
		for(int i = 0; i < wordArray.size(); i++) {
			if(wordArray.get(i).contains("h")) {
				for(int j = 0; j < wordArray.get(i).length(); j++) {
					String word = wordArray.get(i);
					
					if(String.valueOf(word.charAt(j)).equalsIgnoreCase("h")) {
						counter++;
					}
					if((word.length()>1)&&(j>0)) {
						if((String.valueOf(word.charAt(j-1)).equalsIgnoreCase("c"))&&((String.valueOf(word.charAt(j)).equalsIgnoreCase("h")))) {
							counter--;
						}
					}
					
				}
				if(String.valueOf(wordArray.get(i).charAt(0)).equalsIgnoreCase("h")) {
					counter--;
				}
			}
			
		}
		
		System.out.println(counter);
	}
	
	private static void Hpalabras(String cadena) {
		
		StringTokenizer st = new StringTokenizer(cadena);
		List<String> wordArray = new ArrayList<>();
		
		
		String aux = "";
		
		
		while(st.hasMoreTokens()) {
			wordArray.add(st.nextToken());
		}
		
		int hcounter = 0;
		
		for(int i = 0; i < wordArray.size(); i++) {
			int counter = 0;
			if(wordArray.get(i).contains("h")) {
				for(int j = 0; j < wordArray.get(i).length(); j++) {
					String word = wordArray.get(i);
					
					if(String.valueOf(word.charAt(j)).equalsIgnoreCase("h")) {
						counter++;
					}
					if((word.length()>1)&&(j>0)) {
						if((String.valueOf(word.charAt(j-1)).equalsIgnoreCase("c"))&&((String.valueOf(word.charAt(j)).equalsIgnoreCase("h")))) {
							counter--;
						}
					}
					
				}
				if(String.valueOf(wordArray.get(i).charAt(0)).equalsIgnoreCase("h")) {
					counter--;
				}
				if(counter>=1) {
					hcounter++;
				}
			}
			
		}
		
		System.out.println(hcounter);
	}
}
