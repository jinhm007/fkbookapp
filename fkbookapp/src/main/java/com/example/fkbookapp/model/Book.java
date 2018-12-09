package com.example.fkbookapp.model;

import java.io.Serializable;

public class Book  implements Serializable {
    private  Integer id;
    private  String  name;  //书名
    private  String  author;  //作者
    private  String publication; //出版社
    private  String publicationdate;   //出版日期
    private  Double  price;   //价格
    private  String image; //封面图片
    private  String  remark;  //详细描述

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublication() {
        return publication;
    }

    public String getPublicationdate() {
        return publicationdate;
    }

    public Double getPrice() {
        return price;
    }

    public String getImage() {
        return image;
    }

    public String getRemark() {
        return remark;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPublication(String publication) {
        this.publication = publication;
    }

    public void setPublicationdate(String publicationdate) {
        this.publicationdate = publicationdate;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Book(Integer id, String name, String author, String publication, String publicationdate, Double price, String image, String remark) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publication = publication;
        this.publicationdate = publicationdate;
        this.price = price;
        this.image = image;
        this.remark = remark;
    }

    public Book() {
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", publication='" + publication + '\'' +
                ", publicationdate='" + publicationdate + '\'' +
                ", price=" + price +
                ", image='" + image + '\'' +
                ", remark='" + remark + '\'' +
                '}';
    }
}
