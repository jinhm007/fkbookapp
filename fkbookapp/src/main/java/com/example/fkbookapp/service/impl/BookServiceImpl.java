package com.example.fkbookapp.service.impl;

import com.example.fkbookapp.mapper.BookMapper;
import com.example.fkbookapp.model.Book;
import com.example.fkbookapp.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl  implements BookService {

    @Autowired(required=true)
    private BookMapper bookMapper;
    @Override
    public List<Book> getAll() {

        return bookMapper.findAll();
    }

    @Override
    public boolean insert(Book book) {
        if(book.getName()!=null&&!"".equals(book.getName())){
            try {
                int effectNum=bookMapper.addBookInfo(book);
                if(effectNum>0){
                    return  true;
                }else {
                    throw  new RuntimeException("插入信息失败！");
                }

            }catch (Exception e){
                throw  new RuntimeException("插入信息失败！"+e.getMessage());
            }

        }else {
            throw  new RuntimeException("插入信息不能为空");
        }

    }

    @Override
    public void update(Book book) {
        bookMapper.updateBookInfo(book);

    }
}
