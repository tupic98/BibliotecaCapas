package com.alvarenga.biblioteca.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.alvarenga.biblioteca.domain.Book;
import com.alvarenga.biblioteca.service.BookService;

@Controller
public class BookController {

	@Autowired
	private BookService bookService;

	@RequestMapping("/filteredBooks")
	public ModelAndView searchBy(@RequestParam(name = "search") String search,
			@RequestParam(name = "selected") int optionSelected) {

		ModelAndView mav = new ModelAndView();
		
		String judgment = null;

		List<Book> books = null;

		switch (optionSelected) {
		case 0:
			books = bookService.findByTitle(search);
			judgment = "titulo";
			break;
		case 1:
			books = bookService.findByAuthor(search);
			judgment = "autor";
			break;

		case 2:
			books = bookService.findByIsbn(search);
			judgment = "ISBN";
			break;
		case 3:
			books = bookService.findByGenre(search);
			judgment = "genero";
			break;
		}
		
		mav.addObject("books", books);
		mav.addObject("criterio", judgment);
		mav.addObject("nResultados", books.size());
		mav.addObject("datoBuscado", search);
		mav.setViewName("filteredBooks");
		return mav;
	}
	
	@RequestMapping("/inventory")
	public ModelAndView renderAll() {
		ModelAndView mav = new ModelAndView();
		
		String totalBookExistence = bookService.totalBookExistenceQuantity();
		
		String authorsQuantity = bookService.authorsQuantity();
		
		List<Book> books = bookService.findAll();
		
		mav.addObject("books", books);
		mav.addObject("nLibros", totalBookExistence);
		mav.addObject("authorsQuantity", authorsQuantity);
		mav.setViewName("inventory");
		return mav;
	}

}
