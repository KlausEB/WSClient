package com.epam.WSClient.util.actions.impl;

import com.epam.WSClient.App;
import com.epam.WSClient.dto.BookDTO;
import com.epam.WSClient.util.RequestUtil;
import com.epam.WSClient.util.actions.UserAction;
import org.jboss.resteasy.client.jaxrs.ResteasyWebTarget;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.List;

public class SearchBooksByYearPagesNameAction implements UserAction {
    public static final String YEAR_MESSAGE = "Input year of publishing:";
    public static final String NUMBER_PAGE_MESSAGE = "Input number of page:";
    public static final String PART_NAME_MESSAGE = "Input part of the name:";

    public static final String SERVICE_PATH = SEARCH_CONTROLLER_PATH + "/booksByYearPagesName";

    @Override
    public void execute(BufferedReader reader) throws IOException {
        System.out.println(YEAR_MESSAGE);
        int yearOfPublishing = Integer.parseInt(reader.readLine());
        System.out.println(NUMBER_PAGE_MESSAGE);
        int numberOfPages = Integer.parseInt(reader.readLine());
        System.out.println(PART_NAME_MESSAGE);
        String partBookName = reader.readLine();
        ResteasyWebTarget target = App.client.target(SERVICE_PATH)
                .queryParam("year", yearOfPublishing)
                .queryParam("pages", numberOfPages)
                .queryParam("name", partBookName);
        List<BookDTO> books = RequestUtil.get(List.class, target);
        System.out.println(books);
    }
}
