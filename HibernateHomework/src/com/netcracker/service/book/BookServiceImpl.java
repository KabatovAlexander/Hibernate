package com.netcracker.service.book;

import com.netcracker.dao.books.BookDao;
import com.netcracker.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("bookService")
public class BookServiceImpl  implements  BookService {

    @Autowired
    private BookDao bookDao;

    public void add(Book book){
        bookDao.add(book);
    }

    public void deleteBookById(int id) {
        bookDao.deleteBookById(id);
    }

    public void update(int id, Book book) {
        bookDao.update(id, book);
    }

    public List<Book> findAllBooks(){
        return bookDao.findAllBooks();
    }

    public int printQtyOfStrings() {
        return bookDao.printQtyOfStrings();
    }
}
