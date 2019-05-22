package com.alvarenga.biblioteca.service;

import java.util.List;

import com.alvarenga.biblioteca.domain.Book;

public interface BookService {
	public List<Book> findByTitle(String search);
	
	public List<Book> findByAuthor(String search);
	
	public List<Book> findByIsbn(String search);
	
	public List<Book> findByGenre(String search);
	
	public List<Book> findAll();
	
	public String totalBookExistenceQuantity();
	
	public String authorsQuantity();

}
