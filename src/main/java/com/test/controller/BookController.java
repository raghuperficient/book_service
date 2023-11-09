package com.test.controller;

import java.util.List;
import java.util.Optional;

import com.test.model.Book;
import com.test.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@CrossOrigin(origins = "http://books-git-raghu-demo.apps.prft-cps.zuvk.p1.openshiftapps.com/")
@RestController
@RequestMapping("/api")
public class BookController {

  @Autowired
  BookRepository bookRepository;


  @RequestMapping(value="/books", method= RequestMethod.POST)
  public ResponseEntity<Book> createBook(@RequestBody Book book) {
    try {
      Book savedBook = bookRepository.save(new Book(book.getId(), "1"));
      return new ResponseEntity<>(savedBook, HttpStatus.CREATED);
    } catch (Exception e) {
      return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
    }
  }

  @RequestMapping(value="/books", method= RequestMethod.GET)
  public ResponseEntity<List<Book>> getBooks() {
    try {
      List<Book> savedBook = bookRepository.findAll();
      return new ResponseEntity<>(savedBook, HttpStatus.CREATED);
    } catch (Exception e) {
      return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
    }
  }

  @RequestMapping(value="/books/{id}", method= RequestMethod.DELETE)
  public ResponseEntity<HttpStatus> deleteBook(@PathVariable("id") String id) {
    try {
      bookRepository.deleteById(id);
      return new ResponseEntity<>(HttpStatus.OK);
    } catch (Exception e) {
      return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    }
  }


}
