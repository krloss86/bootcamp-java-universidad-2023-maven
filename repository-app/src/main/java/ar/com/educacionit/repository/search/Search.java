package ar.com.educacionit.repository.search;

import java.util.List;

import ar.com.educacionit.entities.AddresBook;

public interface Search {
	public List<AddresBook> execute(List<AddresBook> sourceList);
}
