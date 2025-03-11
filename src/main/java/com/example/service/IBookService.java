package com.example.service;

import com.example.domain.Book;

import java.util.List;

public interface IBookService {

    public Book saveBook(Book book);

    public List<Book>getAllBooks();

    public Book getBookId(Integer id);

    public void deleteBook(Integer id);

    public List<Book>searchBooksByTitle(String title);


}
