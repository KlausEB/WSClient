package com.epam.WSClient.util.actions.impl;

import com.epam.WSClient.App;
import com.epam.WSClient.dto.BookDTO;
import com.epam.WSClient.util.RequestUtil;
import com.epam.WSClient.util.actions.UserAction;
import org.jboss.resteasy.client.jaxrs.ResteasyWebTarget;

import java.io.BufferedReader;
import java.io.IOException;

public class AddBookAction implements UserAction {
    public static final String AUTHOR_MESSAGE = "Input author name:";
    public static final String BOOK_MESSAGE = "Input book name:";
    public static final String ISBN_MESSAGE = "Input ISBN:";
    public static final String YEAR_MESSAGE = "Input year of publishing:";
    public static final String NUMBER_PAGE_MESSAGE = "Input number of page:";

    public static final String SERVICE_PATH = BOOK_CONTROLLER_PATH + "/add";

    @Override
    public void execute(BufferedReader reader) throws IOException {
        System.out.println(AUTHOR_MESSAGE);
        String authorName = reader.readLine();
        System.out.println(BOOK_MESSAGE);
        String bookName = reader.readLine();
        System.out.println(YEAR_MESSAGE);
        int yearOfPublishing = Integer.parseInt(reader.readLine());
        System.out.println(NUMBER_PAGE_MESSAGE);
        int numberOfPages = Integer.parseInt(reader.readLine());
        System.out.println(ISBN_MESSAGE);
        String bookISBN = reader.readLine();
        ResteasyWebTarget target = App.client.target(SERVICE_PATH);
        System.out.println(RequestUtil.post(new BookDTO(bookISBN, authorName, bookName, yearOfPublishing, numberOfPages), target));
    }
}
