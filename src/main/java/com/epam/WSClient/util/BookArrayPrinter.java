package com.epam.WSClient.util;

import com.epam.architecture.soapws.Book;
import com.epam.architecture.soapws.BookArray;

import java.util.List;

public class BookArrayPrinter {
    public static void print(BookArray bookArray) {
        List<Book> bookList = bookArray.getItem();
        for (Book book : bookList) {
            System.out.println(book);
        }
    }
}
