package by_bsu;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

public class Library implements Serializable  {
	private ArrayList<Book> library = new ArrayList<>();

	
	public void add (Book book) {
		library.add(book);
	}
	
	
		public List<Book> getLibrary() {
		return library;
	}
		


	public void setLibrary(ArrayList<Book> library) {
		this.library = library;
	}


		public void delete (int ID) {
		int mark = -1;
		
		for (int i = 0; i < library.size(); i++)  {
			if (ID == library.get(i).getID()){
				mark = i;
				break;
			}
		}
		if (mark != -1)
		library.remove(mark);
}
		
		
		@Override
		public String toString() {
			return library.toString();
		}


		public void printSort () {
			
		ArrayList<Book> clone = new ArrayList<>(this.library);	
		Collections.sort(clone);
		
		System.out.println("AutoSort: " + clone);

		}
		
		
		public TreeSet<String>booksByAuthor (String author) {
			TreeSet<String> set = new TreeSet<>();
			for (Book book : library) {
				if (book.getAuthor().equals(author)) {
					set.add(book.getName());
				}
				
			}
			return set;
		}
		
		
		
}








