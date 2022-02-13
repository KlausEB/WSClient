package com.epam.WSClient.util.actions.impl;

import com.epam.WSClient.App;
import com.epam.WSClient.dto.BookmarkDTO;
import com.epam.WSClient.util.RequestUtil;
import com.epam.WSClient.util.actions.UserAction;
import org.jboss.resteasy.client.jaxrs.ResteasyWebTarget;

import java.io.BufferedReader;
import java.io.IOException;

public class AddBookmarkAction implements UserAction {
    public static final String ISBN_MESSAGE = "Input ISBN:";
    public static final String NUMBER_PAGE_MESSAGE = "Input number of page:";

    public static final String SERVICE_PATH = USER_CONTROLLER_PATH + "/add";

    @Override
    public void execute(BufferedReader reader) throws IOException {
        System.out.println(ISBN_MESSAGE);
        String isbn = reader.readLine();
        System.out.println(NUMBER_PAGE_MESSAGE);
        int pageNumber = Integer.parseInt(reader.readLine());
        ResteasyWebTarget target = App.client.target(SERVICE_PATH);
        System.out.println(RequestUtil.post(new BookmarkDTO(isbn, pageNumber), target));
    }
}
