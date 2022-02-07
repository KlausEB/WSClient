package com.epam.WSClient.util.actions.impl;

import com.epam.WSClient.util.actions.UserAction;
import com.epam.architecture.soapws.impl.SearchSOAPService;
import com.epam.architecture.soapws.impl.SearchSOAPServiceImplService;

import java.io.BufferedReader;
import java.io.IOException;

public class SearchBookByISBNAction implements UserAction {
    public static final String ISBN_MESSAGE = "Input ISBN:";

    SearchSOAPService searchService = new SearchSOAPServiceImplService().getSearchSOAPServiceImplPort();

    @Override
    public void execute(BufferedReader reader) throws IOException {
        System.out.println(ISBN_MESSAGE);
        String isbn = reader.readLine();
        System.out.println(searchService.bookByISBN(isbn));
    }
}
