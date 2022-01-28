package com.epam.WSClient.util.actions.impl;

import com.epam.WSClient.util.BookArrayPrinter;
import com.epam.WSClient.util.actions.UserAction;
import com.epam.architecture.soapws.BookArray;
import com.epam.architecture.soapws.impl.SearchSOAPService;
import com.epam.architecture.soapws.impl.SearchSOAPServiceImplService;

import java.io.BufferedReader;
import java.io.IOException;

public class SearchBooksByYearRangeAction implements UserAction {
    public static final String NUMBER_RANGE_MESSAGE = "Input min and max numbers:";

    SearchSOAPService searchService = new SearchSOAPServiceImplService().getSearchSOAPServiceImplPort();

    @Override
    public void execute(BufferedReader reader) throws IOException {
        System.out.println(NUMBER_RANGE_MESSAGE);
        int minYear = Integer.parseInt(reader.readLine());
        int maxYear = Integer.parseInt(reader.readLine());
        BookArray bookArray = searchService.booksByYearRange(minYear, maxYear);
        BookArrayPrinter.print(bookArray);
    }
}
