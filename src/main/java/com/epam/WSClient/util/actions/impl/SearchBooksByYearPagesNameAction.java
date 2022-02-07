package com.epam.WSClient.util.actions.impl;

import com.epam.WSClient.util.BookArrayPrinter;
import com.epam.WSClient.util.actions.UserAction;
import com.epam.architecture.soapws.BookArray;
import com.epam.architecture.soapws.impl.SearchSOAPService;
import com.epam.architecture.soapws.impl.SearchSOAPServiceImplService;

import java.io.BufferedReader;
import java.io.IOException;

public class SearchBooksByYearPagesNameAction implements UserAction {
    public static final String YEAR_MESSAGE = "Input year of publishing:";
    public static final String NUMBER_PAGE_MESSAGE = "Input number of page:";
    public static final String PART_NAME_MESSAGE = "Input part of the name:";

    SearchSOAPService searchService = new SearchSOAPServiceImplService().getSearchSOAPServiceImplPort();

    @Override
    public void execute(BufferedReader reader) throws IOException {
        System.out.println(YEAR_MESSAGE);
        int yearOfPublishing = Integer.parseInt(reader.readLine());
        System.out.println(NUMBER_PAGE_MESSAGE);
        int numberOfPages = Integer.parseInt(reader.readLine());
        System.out.println(PART_NAME_MESSAGE);
        String partBookName = reader.readLine();
        BookArray bookArray = searchService.booksByYearPagesPartName(yearOfPublishing, numberOfPages, partBookName);
        BookArrayPrinter.print(bookArray);
    }
}
