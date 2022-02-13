package com.epam.WSClient.util.actions.impl;

import com.epam.WSClient.App;
import com.epam.WSClient.dto.BookDTO;
import com.epam.WSClient.util.RequestUtil;
import com.epam.WSClient.util.actions.UserAction;
import org.jboss.resteasy.client.jaxrs.ResteasyWebTarget;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.List;

public class TakeBooksWithMyBookmarkAction implements UserAction {

    public static final String SERVICE_PATH = USER_CONTROLLER_PATH + "/bookmarks";

    @Override
    public void execute(BufferedReader reader) throws IOException {
        ResteasyWebTarget target = App.client.target(SERVICE_PATH);
        List<BookDTO> books = RequestUtil.get(List.class, target);
        System.out.println(books);
    }
}
