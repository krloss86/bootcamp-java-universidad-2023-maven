package ar.com.educacionit.repository.parse.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import ar.com.educacionit.entities.AddresBook;
import ar.com.educacionit.repository.parse.IParser;

public class AddresBookFileParser implements IParser<List<AddresBook>> {

	
	@Override
	public List<AddresBook> parse() {
		
		//deberia leer el archivo linea por linea e ir creando cada AddresBook 
		//luego agregarlo a la lista
		
		List<AddresBook> list = new ArrayList<>();
		
		for(int i=0;i<50;i++) {
			UUID uuid = UUID.randomUUID();
			list.add(new AddresBook(uuid.toString(), "Nombre-"+Math.random(), Math.random()+"@mail.com"));
		}
		
		return list;
	}

}
