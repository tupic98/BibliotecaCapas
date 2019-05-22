package com.alvarenga.biblioteca.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import com.alvarenga.biblioteca.domain.Book;

@Repository
public class BookDAOImpl implements BookDAO {

	@PersistenceContext(unitName = "biblioteca")
	private EntityManager entityManager;

	@Override
	public List<Book> findByTitle(String search) throws DataAccessException {
		StringBuffer sb = new StringBuffer();
		sb.append("SELECT * FROM public.libro WHERE title LIKE CONCAT('%',?1,'%')");
		Query query = entityManager.createNativeQuery(sb.toString(), Book.class);
		query.setParameter(1, search);
		@SuppressWarnings("unchecked")
		List<Book> resultset = query.getResultList();
		return resultset;
	}

	@Override
	public List<Book> findByAuthor(String search) throws DataAccessException {
		StringBuffer sb = new StringBuffer();
		sb.append("SELECT * FROM public.libro WHERE author LIKE CONCAT('%',?1,'%')");
		Query query = entityManager.createNativeQuery(sb.toString(), Book.class);
		query.setParameter(1, search);
		@SuppressWarnings("unchecked")
		List<Book> resultset = query.getResultList();
		return resultset;
	}

	@Override
	public List<Book> findByIsbn(String search) throws DataAccessException {
		StringBuffer sb = new StringBuffer();
		sb.append("SELECT * FROM public.libro WHERE isbn LIKE CONCAT('%',?1,'%')");
		Query query = entityManager.createNativeQuery(sb.toString(), Book.class);
		query.setParameter(1, search);
		@SuppressWarnings("unchecked")
		List<Book> resultset = query.getResultList();
		return resultset;
	}

	@Override
	public List<Book> findByGenre(String search) throws DataAccessException {
		StringBuffer sb = new StringBuffer();
		sb.append("SELECT * FROM public.libro WHERE genre LIKE CONCAT('%',?1,'%')");
		Query query = entityManager.createNativeQuery(sb.toString(), Book.class);
		query.setParameter(1, search);
		@SuppressWarnings("unchecked")
		List<Book> resultset = query.getResultList();
		return resultset;
	}

	@Override
	public List<Book> findAll() throws DataAccessException {
		StringBuffer sb = new StringBuffer();
		sb.append("SELECT * FROM public.libro");
		Query query = entityManager.createNativeQuery(sb.toString(), Book.class);
		@SuppressWarnings("unchecked")
		List<Book> resultset = query.getResultList();
		return resultset;
	}

	@Override
	public String authorsQuantity() throws DataAccessException {
		StringBuffer sb = new StringBuffer();
		sb.append("SELECT COUNT(DISTINCT(author)) FROM public.libro");
		Query query = entityManager.createNativeQuery(sb.toString());
		String result = query.getSingleResult().toString();
		return result;
	}

	@Override
	public String totalBookExistenceQuantity() throws DataAccessException {
		StringBuffer sb = new StringBuffer();
		sb.append("SELECT SUM(quantity) FROM public.libro");
		Query query = entityManager.createNativeQuery(sb.toString());
		String result = query.getSingleResult().toString();
		return result;
	}

}
