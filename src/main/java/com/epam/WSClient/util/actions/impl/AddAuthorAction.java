package com.epam.WSClient.util.actions.impl;

import com.epam.WSClient.util.actions.UserAction;
import com.epam.architecture.soapws.impl.BookSOAPService;
import com.epam.architecture.soapws.impl.BookSOAPServiceImplService;

import java.io.BufferedReader;
import java.io.IOException;

public class AddAuthorAction implements UserAction {
    public static final String AUTHOR_MESSAGE = "Input author name:";

    BookSOAPService bookService = new BookSOAPServiceImplService().getBookSOAPServiceImplPort();

    @Override
    public void execute(BufferedReader reader) throws IOException {
        System.out.println(AUTHOR_MESSAGE);
        String authorName = reader.readLine();
        System.out.println(bookService.addAuthor(authorName));
    }
}
