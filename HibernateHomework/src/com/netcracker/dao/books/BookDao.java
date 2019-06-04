package com.netcracker.dao.books;

import com.netcracker.model.Book;
import java.util.List;

public interface BookDao {

    void add(Book book);

    void deleteBookById(int id);

    void update(int id, Book book);

    List<Book> findAllBooks();

    int printQtyOfStrings();

}
