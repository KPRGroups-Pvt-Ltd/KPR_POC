package com.example.openApiDoc.service;


import com.example.openApiDoc.modal.Book;
import com.example.openApiDoc.repo.BooksRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    BooksRepo booksRepo;

    //HashSet<Book> bookList = new HashSet<Book>();
    @Override
    public List<Book> findAllBook() {
            return booksRepo.findAll().stream().collect(Collectors.toList());
    }

    public String updateBook(Book book){
        Book book1 = booksRepo.findById(book.getId()).get();
        book1.setTitle(book.getTitle());
        book1.setName(book.getName());
        book1.setId(book.getId());
        booksRepo.save(book1);
        return  " successfully updated book id= "+ book.getId();
    }

    @Override
    public Book findBookByID(long id) {
        return booksRepo.findAllById(id);
    }
    @Override
    public Book addBook(Book b) {
        return booksRepo.save(b);
    }
    @Override
    public String deleteData(long id) {
        booksRepo.deleteById(id);
        return "successfully deleted book id = "+ id;
    }
}
