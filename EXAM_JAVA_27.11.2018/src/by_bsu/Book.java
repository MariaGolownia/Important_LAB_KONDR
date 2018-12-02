package by_bsu;

import java.io.Serializable;

public class Book implements Comparable<Book>, Serializable{

	private int ID;
	private String author;
	private String name;
	private int count;
	private double price;
	
	
	
	public Book(int iD, String author, String name, int count, double price) {
		super();
		ID = iD;
		this.author = author;
		this.name = name;
		this.count = count;
		this.price = price;
	}
	
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Book [ID=" + ID + ", author=" + author + ", name=" + name + ", count=" + count + ", price=" + price
				+ "]\n";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ID;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (ID != other.ID)
			return false;
		return true;
	}

	@Override
	public int compareTo(Book book2) {
		if (this.author.equals(book2.author)) {
			return name.compareTo(book2.name);}
		
		return author.compareTo(book2.author);
	}

	
	
	
}
