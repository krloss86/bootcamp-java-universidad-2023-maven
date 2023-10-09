package ar.com.educacionit.repository.parse.impl;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import ar.com.educacionit.entities.AddresBook;
import ar.com.educacionit.repository.parse.IParser;

public class AddresBookFileParser implements IParser<List<AddresBook>> {
	
	private File file;
	private FileDelimiterEnum delimiter;
	
	//Value Object
	public AddresBookFileParser(String path,FileDelimiterEnum delimiter) {
		//validaciones
		if(path == null || path.trim().length() == 0) {
			throw new IllegalArgumentException("Path del file");
		}
					
		file = new File(path);
		if(!file.exists()) {
			throw new IllegalArgumentException("File no existe");
		}
		
		if(file.isDirectory()) {
			throw new IllegalArgumentException("File es un directorio");
		}
		
		//mas validaciones 
		if(delimiter == null) {
			throw new IllegalArgumentException("Delimitador no especificado");
		}
			
		this.delimiter = delimiter;
	}

	@Override
	public List<AddresBook> parse() throws Exception{
		
		List<AddresBook> list = new ArrayList<>();
		
		//leer el archivo!
		FileReader reader = new FileReader(file);
		
		//usar un buffer
		BufferedReader br = new BufferedReader(reader);
		
		String readLine = null;
		
		//la primer linea es de los titulos		
		String[] titulos = br.readLine().split(this.delimiter.getDelimiter());//????;
		
		//leer linea por linea
		while((readLine = br.readLine()) != null) {			
			String[] values = readLine.split(this.delimiter.getDelimiter());
			
			if(values.length == titulos.length) {
				AddresBook ab = new AddresBook(values[0],values[1],values[2]); 
				list.add(ab);
			}else {
				System.err.println(readLine);
			}			
		}
		
		br.close();
		
		return list;
	}

}
