package com.example.BookHub.Repository;

import java.util.*;
import com.example.BookHub.model.Book;

public interface BookRepository {
    ArrayList<Book> getBooks();

    Book getBookById(int bookId);

    Book addBook(Book book);

    Book updateBook(int bookId, Book book);

    void deleteBook(int bookId);
}