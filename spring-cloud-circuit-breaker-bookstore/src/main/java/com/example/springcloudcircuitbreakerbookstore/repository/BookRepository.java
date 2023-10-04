package com.example.springcloudcircuitbreakerbookstore.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.springcloudcircuitbreakerbookstore.data.Book;
import org.springframework.data.repository.CrudRepository;



public interface BookRepository extends  CrudRepository <Book, Long> {
}