package com.example.springcloudcircuitbreakerbookstore.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springcloudcircuitbreakerbookstore.data.Book;
import com.example.springcloudcircuitbreakerbookstore.repository.BookRepository;

import reactor.core.publisher.Mono;

@RestController
@RequestMapping(value = "/api")
public class BookController {
	
	 BookRepository bookRepository;
	 	
	public BookController(BookRepository bookRepository) {
		super();
		this.bookRepository = bookRepository;
	}
	
	@GetMapping
	public Mono<Iterable<Book>> readingList(){
	    return Mono.just( bookRepository.findAll());
	  }

	
	@GetMapping("/list")
	public List <Book> getBooks(){
	    return (List<Book>) bookRepository.findAll();
	  }


}
