package com.epam.WSClient.util.actions.impl;

import com.epam.WSClient.util.actions.UserAction;
import com.epam.architecture.soapws.impl.UserSOAPService;
import com.epam.architecture.soapws.impl.UserSOAPServiceImplService;

import java.io.BufferedReader;
import java.io.IOException;

public class DeleteBookmarkAction implements UserAction {
    public static final String ISBN_MESSAGE = "Input ISBN:";
    public static final String NUMBER_PAGE_MESSAGE = "Input number of page:";

    UserSOAPService userService = new UserSOAPServiceImplService().getUserSOAPServiceImplPort();

    @Override
    public void execute(BufferedReader reader) throws IOException {
        System.out.println(ISBN_MESSAGE);
        String isbn = reader.readLine();
        System.out.println(NUMBER_PAGE_MESSAGE);
        int pageNumber = Integer.parseInt(reader.readLine());
        System.out.println(userService.deleteBookmark(isbn, pageNumber));
    }
}
