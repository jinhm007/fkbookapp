package com.example.fkbookapp.service;

import com.example.fkbookapp.model.Book;

import java.util.List;

public interface BookService {
    List<Book> getAll();

    boolean insert(Book book);

    void  update(Book book);


}
