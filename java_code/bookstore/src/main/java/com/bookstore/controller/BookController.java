package com.bookstore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.bookstore.dao.Book;
import com.bookstore.dao.BookDao;

@RestController
@RequestMapping(path="api")
public class BookController {
	
	@Autowired
	private BookDao bookDao;
	
	
	@GetMapping(path="hello/{name}")
	public String hello(@PathVariable String name) {
		return "hello rest api" + " "+ name;
	}
	
	// versing, valiation, status code
	
	//show code to get all books
	@ResponseStatus(code=HttpStatus.OK)
	@GetMapping(path="v1/books")
	public List<Book> getAll(){
		return bookDao.getAll();
	}
	
	@ResponseStatus(code=HttpStatus.OK)
	@GetMapping(path="v2/books")
	public List<Book> getAllV2(){
		return bookDao.getAll();
	}
	
	//get books by id
	@ResponseStatus(code=HttpStatus.OK)
	@GetMapping(path="v1/books/{id}")
	public Book getById(@PathVariable  int id) {
		return bookDao.getBookById(id);
	}
	
	//add book
	@ResponseStatus(code=HttpStatus.CREATED)
	@PostMapping(path="v1/books")
	public Book addBook(@RequestBody  Book book) {
		return bookDao.addBook(book);
	}
	
	//update book
	@ResponseStatus(code=HttpStatus.OK)
	@PutMapping(path="v1/books/{id}")
	public Book updateBook(@PathVariable  int id, @RequestBody  Book book) {
		return bookDao.updateBook(id, book);
	}
	
	//delete book
	@ResponseStatus(code=HttpStatus.NO_CONTENT)
	@DeleteMapping(path="v1/books/{id}")
	public void deleteBook(@PathVariable  int id) {
		 bookDao.removeBook(id);
	}
	

}
