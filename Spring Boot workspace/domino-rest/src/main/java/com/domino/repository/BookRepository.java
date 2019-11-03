package com.domino.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.domino.dto.Book;

@Repository
public class BookRepository {
	
	public static List<Book> listOfBooks = new ArrayList<Book>(){{
			add(new Book(1,"Harry Potter"));
			add(new Book(2,"Games of Thrones"));
			add(new Book(3,"Life of Pi"));
			add(new Book(4,"White Tiger"));
			}};
			
}
