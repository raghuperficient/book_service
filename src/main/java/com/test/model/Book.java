package com.test.model;

import jakarta.persistence.*;


@Entity
public class Book {

  @Id
  private String id;
  private String title;
  private String userId;
  public Book(String id, String userId) {
    super();
    this.id = id;
    this.userId = userId;
  }
  public Book() {
    super();
    // TODO Auto-generated constructor stub
  }
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }
  public String getTitle() {
    return title;
  }
  public void setTitle(String name) {
    this.title = name;
  }
  public String getUserId() {
    return userId;
  }
  public void setUserId(String userId) {
    this.userId = userId;
  }


}