package ar.com.educacionit.console.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileMain {
	public static void main(String[] args) throws IOException {
		// crear un File a un archivo en disco
		String path = "C:\\desarrollo\\educationit\\bootcamp-java-universidad-2023\\address-book.csv";

		File file = new File(path);
	
		//abrir un archivo (texto, csv, txt) no puedo leer binarios (zip,mkv, jpg, etc)
		FileReader reader = new FileReader(file);
	
		//usar un buffer
		BufferedReader br = new BufferedReader(reader);
		
		String readLine = null;
		
		//leer linea por linea
		while((readLine = br.readLine()) != null) {
			//en readline tengo la linea leida!
			System.out.println(readLine);
		}
		br.close();
	}
}
