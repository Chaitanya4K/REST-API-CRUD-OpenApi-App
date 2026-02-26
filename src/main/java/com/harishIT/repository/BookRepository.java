package com.harishIT.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.harishIT.entity.Book;

public interface BookRepository extends JpaRepository<Book,Serializable>{

}
