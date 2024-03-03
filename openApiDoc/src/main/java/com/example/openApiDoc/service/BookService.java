package com.example.openApiDoc.service;

import com.example.openApiDoc.modal.Book;

import java.util.HashSet;
import java.util.List;

public interface BookService {
    public List<Book> findAllBook();
    public Book findBookByID(long id);
    public Book addBook(Book b);
    public String deleteData(long id);
    public String updateBook(Book book);
}
