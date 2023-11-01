package com.test.service;

import com.test.model.Book;
import com.test.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
//service
public class BookService {

    @Autowired
    private BookRepository bRepo;

    public void save(Book b) {
        bRepo.save(b);
    }

    public List<Book> getAllBook(){
        return bRepo.findAll();
    }

    public Book getBookById(int id) {
        return bRepo.findById(id).get();
    }
    public void deleteById(int id) {
        bRepo.deleteById(id);
    }
}
