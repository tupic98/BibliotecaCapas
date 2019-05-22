package com.alvarenga.biblioteca.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alvarenga.biblioteca.dao.BookDAO;
import com.alvarenga.biblioteca.domain.Book;

@Service
public class BookServiceImpl implements BookService {

	@Autowired
	BookDAO bookDao;

	@Override
	public List<Book> findByTitle(String search) {
		return bookDao.findByTitle(search);
	}

	@Override
	public List<Book> findByAuthor(String search) {
		return bookDao.findByAuthor(search);
	}

	@Override
	public List<Book> findByIsbn(String search) {
		return bookDao.findByIsbn(search);
	}

	@Override
	public List<Book> findByGenre(String search) {
		return bookDao.findByGenre(search);
	}

	@Override
	public List<Book> findAll() {
		return bookDao.findAll();
	}

	@Override
	public String totalBookExistenceQuantity() {
		return bookDao.totalBookExistenceQuantity();
	}

	@Override
	public String authorsQuantity() {
		return bookDao.authorsQuantity();
	}

}
