package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {

    //    @Autowired nie je best practice
    private BookService bookService;

    //    best practice --> Service v Constructor
    public BookController(BookService bookService){
        this.bookService = bookService;
    }

    @GetMapping("/api/books")
    public List<Book> getBooks(@RequestParam(required = false) String bookAuthor){
        return bookService.getBooks(bookAuthor);
    }

    @GetMapping("/api/books/{bookId}")
    public Book getBook(@PathVariable Integer bookId){
        return bookService.getBook(bookId);
    }

    @PostMapping("/api/books")
    public Integer createBook(@RequestBody Book book){
        return bookService.createBook(book);
    }

    @DeleteMapping("/api/books/{bookId}")
    public void deleteBook(@PathVariable Integer bookId){
        bookService.deleteBook(bookId);
    }

    @PutMapping("/api/books/{bookId}")
    public void updateBook(@PathVariable Integer bookId, @RequestBody Book book){
        bookService.updateBook(bookId, book);
    }
}