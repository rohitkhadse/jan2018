package com.domino.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.domino.dto.Book;
import com.domino.repository.BookRepository;

@Service
public class BookService {

	public List<Book> getAllBooks(){
		return BookRepository.listOfBooks;
	}
}
