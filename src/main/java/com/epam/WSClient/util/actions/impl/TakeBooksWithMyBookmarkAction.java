package com.epam.WSClient.util.actions.impl;

import com.epam.WSClient.util.BookArrayPrinter;
import com.epam.WSClient.util.SaveUserService;
import com.epam.WSClient.util.actions.UserAction;
import com.epam.architecture.soapws.BookArray;
import com.epam.architecture.soapws.impl.SOAPException;
import com.epam.architecture.soapws.impl.UserSOAPService;
import com.epam.architecture.soapws.impl.UserSOAPServiceImplService;

import java.io.BufferedReader;
import java.io.IOException;

public class TakeBooksWithMyBookmarkAction implements UserAction {
    UserSOAPService userService = new UserSOAPServiceImplService().getUserSOAPServiceImplPort();

    @Override
    public void execute(BufferedReader reader) throws IOException, SOAPException {
        String login = SaveUserService.getLogin();
        BookArray bookArray = userService.booksWithUserBookmarks();
        BookArrayPrinter.print(bookArray);
    }
}
