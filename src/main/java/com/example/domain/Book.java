package com.example.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "library")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Book {

 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 @Column(name = "id")
private Integer id;

 @Column(name = "title")
private String title;

 @Column(name = "author")
private String author;

 @Column(name = "publisher")
private String publisher;

 @Column(name = "yearPublished")
private int  yearPublished;

 @Column(name = "pages")
private int pages;

 public Integer getId() {
  return id;
 }

 public void setId(Integer id) {
  this.id = id;
 }

 public String getTitle() {
  return title;
 }

 public void setTitle(String title) {
  this.title = title;
 }

 public String getAuthor() {
  return author;
 }

 public void setAuthor(String author) {
  this.author = author;
 }

 public String getPublisher() {
  return publisher;
 }

 public void setPublisher(String publisher) {
  this.publisher = publisher;
 }

 public int getYearPublished() {
  return yearPublished;
 }

 public void setYearPublished(int yearPublished) {
  this.yearPublished = yearPublished;
 }

 public int getPages() {
  return pages;
 }

 public void setPages(int pages) {
  this.pages = pages;
 }

 public void addAttribute(String book, Book book1) {
 }
}
