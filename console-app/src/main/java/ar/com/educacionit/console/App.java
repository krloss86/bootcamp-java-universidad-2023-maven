package ar.com.educacionit.console;

import java.util.List;
import java.util.Scanner;

import ar.com.educacionit.entities.AddresBook;
import ar.com.educacionit.repository.parse.impl.AddresBookFileParser;
import ar.com.educacionit.repository.search.Search;
import ar.com.educacionit.repository.search.impl.FirstAndLastNameSerach;

public class App {
	public static void main(String[] args) {
		//ctrl+alt+down > copy lines
		//1 cargar el archivo csv 
		AddresBookFileParser parse = new AddresBookFileParser();
		List<AddresBook> listado =  parse.parse();
		
		Scanner keyboard = new Scanner(System.in);
		//2 mostrar menu al usuario
		Integer op = null;
		do {
			Menu.showMenu();
			op = Menu.getOp(keyboard);
		}while(op < 1 || op > 4);
		
		Search search = null;
		//evaluo en base a la opcion que accion ejecuto
		switch (op) {
			case 1: {
				System.out.println("First Name");
				String firstName = keyboard.next();
				
				System.out.println("Last Name");
				String lastName = keyboard.next();
				search = new FirstAndLastNameSerach();
				((FirstAndLastNameSerach)search).setFirstName(firstName);
				((FirstAndLastNameSerach)search).setLastName(lastName);
			}
		}
		
		var filteredList = search.execute(listado);
		
		//3 buscar en base a la opcion
		
		//4 mostrar recursivamente
		
		//5 pregungar si continua
		
		//6 fin		
	}
}
