package com.example.service;

import com.example.domain.Book;
import com.example.repository.BookRepository;
import com.fasterxml.jackson.annotation.OptBoolean;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class BookService implements  IBookService{

    @Autowired
    private BookRepository bookRepository;


    @Override
    public Book saveBook(Book book) {
        return bookRepository.save(book);
    }


    @Override
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    @Override
    public Book getBookId(Integer id) {
        Optional<Book>optional=bookRepository.findById(id);
        if(optional.isEmpty()){
            return null;
        }
        else{
            return optional.get();
        }
    }

    @Override
    public void deleteBook(Integer id) {
        Book dbBook=getBookId(id);
        if(dbBook!=null){
            bookRepository.delete(dbBook);
        }
    }


    @Override
    public List<Book> searchBooksByTitle(String title) {
        return bookRepository.findByTitle(title);
    }
}
