package com.alvarenga.biblioteca.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.alvarenga.biblioteca.domain.Book;

public interface BookDAO {
	
	public List<Book> findByTitle(String search) throws DataAccessException;
	
	public List<Book> findByAuthor(String search) throws DataAccessException;
	
	public List<Book> findByIsbn(String search) throws DataAccessException;
	
	public List<Book> findByGenre(String search) throws DataAccessException;
	
	public List<Book> findAll() throws DataAccessException;
	
	public String totalBookExistenceQuantity() throws DataAccessException;
	
	public String authorsQuantity() throws DataAccessException;
}
