package com.epam.WSClient.util.actions.impl;

import com.epam.WSClient.util.actions.UserAction;
import com.epam.architecture.soapws.impl.BookSOAPService;
import com.epam.architecture.soapws.impl.BookSOAPServiceImplService;

import java.io.BufferedReader;
import java.io.IOException;

public class DeleteBookAction implements UserAction {
    public static final String ISBN_MESSAGE = "Input ISBN:";

    BookSOAPService bookService = new BookSOAPServiceImplService().getBookSOAPServiceImplPort();

    @Override
    public void execute(BufferedReader reader) throws IOException {
        System.out.println(ISBN_MESSAGE);
        String bookISBN = reader.readLine();
        System.out.println(bookService.deleteBook(bookISBN));
    }
}
