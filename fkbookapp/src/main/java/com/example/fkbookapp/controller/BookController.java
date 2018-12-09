package com.example.fkbookapp.controller;

import com.example.fkbookapp.model.Book;
import com.example.fkbookapp.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookController {
    @Autowired
    private BookService bookService;

    @RequestMapping(value ="/main",method = RequestMethod.GET)
    public List<Book>  main(){
        List<Book> list =bookService.getAll();
        return  list;
    }

    @RequestMapping(value ="/addBook",method = RequestMethod.GET)
    public  String addBook(){
        Book book =new Book();
        book.setAuthor("jinhm");
        book.setImage("liuyilin.jpg");
        book.setName("jinhm007");
        book.setPrice(23.33);
        book.setPublication("清华出版社");
        book.setPublicationdate("2017-1-1");
        book.setRemark("随便");
        bookService.insert(book);
        return  ("success"+book.toString());
    }


}
