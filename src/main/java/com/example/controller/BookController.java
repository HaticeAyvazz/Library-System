package com.example.controller;

import com.example.domain.Book;
import com.example.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin(origins ="http://localhost:63342")
@RequestMapping(path = "/rest/api/book")
public class BookController implements IBookController{

    @Autowired
    private IBookService bookService;

    @PostMapping(path = "/save")
    @Override
    public ResponseEntity<Map<String, Object>> save(@RequestBody Book book) {
        Book savedBook = bookService.saveBook(book);

        //Create a JSON response
        Map<String, Object> response = new HashMap<>();
        response.put("book", savedBook);    //We are returning the information of the saved book.
        response.put("redirect", "/success.html");   //The page to be redirected to

        return ResponseEntity.ok(response);
    }


    @GetMapping(path ="/list")
    @Override
    public List<Book> getAllBooks() {
        return bookService.getAllBooks();
    }


    @GetMapping(path = "/list/{id}")
    @Override
    public Book getBookById(int id) {
        return bookService.getBookId(id);
    }


    @DeleteMapping(path = "/delete/{id}")
    @Override
    public void deleteBook(@PathVariable(name = "id") Integer id) {
        bookService.deleteBook(id);
    }



    @GetMapping(path = "/search/{title}")
    @Override
    public List<Book>searchBooksByTitle(@PathVariable(name = "title") String title) {
        return bookService.searchBooksByTitle(title);
    }
}
