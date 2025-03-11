package com.example.controller;

import com.example.domain.Book;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public interface IBookController {

    public ResponseEntity<Map<String, Object>> save(Book book);

    public List<Book>getAllBooks();

    public Book getBookById(int id);

    public void deleteBook(Integer id);

    public List<Book> searchBooksByTitle(String title);
}
