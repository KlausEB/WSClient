package com.epam.WSClient.util.actions.impl;

import com.epam.WSClient.util.BookArrayPrinter;
import com.epam.WSClient.util.actions.UserAction;
import com.epam.architecture.soapws.BookArray;
import com.epam.architecture.soapws.impl.SearchSOAPService;
import com.epam.architecture.soapws.impl.SearchSOAPServiceImplService;

import java.io.BufferedReader;
import java.io.IOException;

public class SearchBooksByNameAction implements UserAction {
    public static final String PART_NAME_MESSAGE = "Input part of the name:";

    SearchSOAPService searchService = new SearchSOAPServiceImplService().getSearchSOAPServiceImplPort();

    @Override
    public void execute(BufferedReader reader) throws IOException {
        System.out.println(PART_NAME_MESSAGE);
        String partName = reader.readLine();
        BookArray bookArray = searchService.booksByPartName(partName);
        BookArrayPrinter.print(bookArray);
    }
}
