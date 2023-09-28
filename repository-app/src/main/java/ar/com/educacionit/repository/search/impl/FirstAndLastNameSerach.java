package ar.com.educacionit.repository.search.impl;

import java.util.ArrayList;
import java.util.List;

import ar.com.educacionit.entities.AddresBook;
import ar.com.educacionit.repository.search.Search;

public class FirstAndLastNameSerach implements Search {

	private String firstName;
	private String lastName;

	@Override
	public List<AddresBook> execute(List<AddresBook> sourceList) {
		
		List<AddresBook> filteredList = new ArrayList<>();
		
		for (AddresBook addresBook : sourceList) {
			if(addresBook.getName().toLowerCase().contains(this.firstName.toLowerCase()) 
				&& addresBook.getName().contains(this.lastName)) {
				filteredList.add(addresBook);
			}
		}
		
		return filteredList;
	}

	public void setFirstName(String firstName) {
		if(firstName == null) {
			throw new IllegalArgumentException("firstName is null");
		}
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		if(lastName == null) {
			throw new IllegalArgumentException("lastName is null");
		}
		this.lastName = lastName;
	}
	
	
}
