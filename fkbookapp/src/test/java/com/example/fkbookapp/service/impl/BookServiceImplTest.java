package com.example.fkbookapp.service.impl;

import com.example.fkbookapp.model.Book;
import com.example.fkbookapp.service.BookService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import static java.util.Calendar.DATE;
import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BookServiceImplTest {
    @Autowired
    private BookService bookService;

    @Test
    public void getAll() {
        List<Book>  books=bookService.getAll();
        Assert.assertEquals(7,books.size());
        System.out.println(books.toString());

    }

  /**  @Test
    public void insert() throws ParseException {
        Book book =new Book();
        book.setAuthor("jinhm");
        book.setImage("liuyilin.jpg");
        book.setName("jinhm007");
        book.setPrice(23.33);
        book.setPublication("清华出版社");
        book.setPublicationdate("2017-1-1");
        book.setRemark("随便");
        bookService.insert(book);
    }
   **/

    @Test
    public void update() {

        Book book=new Book();
        book.setName("jinhm008");
        book.setPublication("天才出版社");
        book.setRemark("企业应用实战");
        book.setId(3);
        bookService.update(book);


    }
}