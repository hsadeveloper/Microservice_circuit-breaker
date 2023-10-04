package com.example.springcloudcircuitbreakerbookstore.data;

import org.springframework.data.annotation.Id;

public class Book {

    @Id
    private Long id;
    private String bookName;
    private String author;
    private String isbn;

	
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

}
