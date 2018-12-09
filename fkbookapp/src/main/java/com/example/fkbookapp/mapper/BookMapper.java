package com.example.fkbookapp.mapper;

import com.example.fkbookapp.model.Book;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookMapper {

    List<Book>  findAll();

    int addBookInfo(Book user);

    int delBookInfo(int id);

    int updateBookInfo(Book user);
}
