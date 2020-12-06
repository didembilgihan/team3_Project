package com.nevin.didem.bilgihan.team3_project;

public class Book {
    private int id;
    private String name;
    private String author;
    private String detail;
    private String category;
    private String image;

    public Book(int id, String name, String author, String detail, String category, String image) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.detail = detail;
        this.category = category;
        this.image = image;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
