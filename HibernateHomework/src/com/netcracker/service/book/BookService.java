package com.netcracker.service.book;

import com.netcracker.model.Book;

import java.util.List;

public interface BookService {

    void add(Book book);

    void deleteBookById(int id);

    void update(int id, Book book);

    List<Book> findAllBooks();

    int printQtyOfStrings();

}
