package com.alvarenga.biblioteca.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(schema="public", name="libro")
public class Book {

	@Id
	@GeneratedValue(generator = "libro_id_seq", strategy = GenerationType.AUTO)
	@SequenceGenerator(name = "libro_id_seq", sequenceName = "public.libro_id_seq", allocationSize = 1)
	@Column(name = "id")
	private Integer bookId;
	
	@Column(name = "title")
	private String bookTitle;
	
	@Column(name = "author")
	private String bookAuthor;
	
	@Column(name = "isbn")
	private String bookISBN;
	
	@Column(name = "genre")
	private String bookGenre;
	
	@Column(name = "quantity")
	private Integer bookQuantity;

	public Book(Integer bookId, String bookTitle, String bookAuthor, String bookISBN, String bookGenre,
			Integer bookQuantity) {
		this.bookId = bookId;
		this.bookTitle = bookTitle;
		this.bookAuthor = bookAuthor;
		this.bookISBN = bookISBN;
		this.bookGenre = bookGenre;
		this.bookQuantity = bookQuantity;
	}
	
	public Book() {}

	public Integer getBookId() {
		return bookId;
	}

	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}

	public String getBookTitle() {
		return bookTitle;
	}

	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}

	public String getBookAuthor() {
		return bookAuthor;
	}

	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}

	public String getBookISBN() {
		return bookISBN;
	}

	public void setBookISBN(String bookISBN) {
		this.bookISBN = bookISBN;
	}

	public String getBookGenre() {
		return bookGenre;
	}

	public void setBookGenre(String bookGenre) {
		this.bookGenre = bookGenre;
	}

	public Integer getBookQuantity() {
		return bookQuantity;
	}

	public void setBookQuantity(Integer bookQuantity) {
		this.bookQuantity = bookQuantity;
	}

	
}
