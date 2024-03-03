
/**
 * @author rajukshirsagar
 * @package com.example.openApiDoc.config
 * @date 03/03/24
 * @time 4:15 PM
 * @month Mar
 * @year 2024
 * @emailID raju.kshirsagar151@gmail.com
 */
package com.example.openApiDoc.controller;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import com.example.openApiDoc.modal.Book;
import com.example.openApiDoc.service.BookServiceImpl;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@Tag(name= "Book Controller", description= "*****Uses for to get book details or add details")
public class BookController {

    @Autowired
    BookServiceImpl bookServiceImpl;

    @PostMapping("/")
    public Book addBook(@RequestBody Book book) {
       return bookServiceImpl.addBook(book);
    }

    @PutMapping("/update")
    public String updateBook(@RequestBody Book book) {
        return bookServiceImpl.updateBook(book);
    }

    @GetMapping("/findall")
    public List<Book> getAllBook() {
        return bookServiceImpl.findAllBook();
    }

    @GetMapping("/findbyid/{id}")
    public Book geBookById(@PathVariable long id) {
        return bookServiceImpl.findBookByID(id);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteBook(@PathVariable long id) {
       return bookServiceImpl.deleteData(id);

    }

}
