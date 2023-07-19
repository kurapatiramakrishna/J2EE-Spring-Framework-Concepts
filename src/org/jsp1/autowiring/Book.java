package org.jsp1.autowiring;
//This is the parent class where 'Author' is a dependency
public class Book {
 private String bookName;
 private String bookId;
 private double price;
 private author author; // Autowired property

 public Book(String bookName, String bookId, double price) {
     this.bookName = bookName;
     this.bookId = bookId;
     this.price = price;
 }

 // Getters and setters...
 

 public void setAuthor(author author) {
     this.author = author;
 }

 public String getBookName() {
	return bookName;
}

public void setBookName(String bookName) {
	this.bookName = bookName;
}

public String getBookId() {
	return bookId;
}

public void setBookId(String bookId) {
	this.bookId = bookId;
}

public double getPrice() {
	return price;
}

public void setPrice(double price) {
	this.price = price;
}

public author getAuthor() {
	return author;
}

// To override toString() method
 @Override
 public String toString()
 {
     return "Book [bookName=" + bookName + ", bookId=" + bookId + ", price=" + price + ", author=" + author + "]";
 }
}