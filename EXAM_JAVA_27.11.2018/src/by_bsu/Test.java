package by_bsu;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Test {

	public static void main(String[] args) throws FileNotFoundException, IOException {
	
		Book book1 = new Book(1, "Достоевский", "Преступление и наказание", 5, 20);
		Book book2 = new Book(2, "Толстой", "Война и мир", 7, 50);
		Book book3 = new Book(3, "Эмиль Золя", "Преступление и наказание", 5, 20);
		Book book4 = new Book(4, "Толстой", "Война и мир", 7, 50);
		Book book5 = new Book(5, "Толстой", "Анна", 7, 50);
		Book book6 = new Book(6, "Толстой", "Ямщик", 5, 20);
		Book book7 = new Book(7, "Толстой", "Пропорщик", 7, 50);
		
		NewLibrary lib = new NewLibrary();
		lib.add(book1);
		lib.add(book2);
		lib.add(book3);
		lib.add(book4);
		
		System.out.println(lib.toString());
		
		
		Library lib2 = new Library ();
		lib2.add(book1);
		lib2.add(book2);
		lib2.add(book3);
		lib2.add(book4);
		lib2.add(book5);
		lib2.add(book6);
		lib2.add(book7);
		
		System.out.println(lib2.toString());
		
		lib2.delete(20);
		System.out.println(lib2.toString());
		
		
		lib2.printSort();
		System.out.println(lib2.toString());
		
		System.out.println(lib2.booksByAuthor("Толстой"));
		
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("lib.bin"));
		out.writeObject(lib2);
		
	}

}
