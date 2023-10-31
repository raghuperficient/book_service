package com.test.model;

import jakarta.persistence.*;


@Entity
public class Book {

  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
  private int id;
  private String title;
  private String author;
  public Book(String title, String author) {
    super();
    this.id = id;
    this.title = title;
    this.author = author;
  }
  public Book() {
    super();
    // TODO Auto-generated constructor stub
  }
  public int getId() {
    return id;
  }
  public void setId(int id) {
    this.id = id;
  }
  public String getTitle() {
    return title;
  }
  public void setTitle(String name) {
    this.title = name;
  }
  public String getAuthor() {
    return author;
  }
  public void setAuthor(String author) {
    this.author = author;
  }


}