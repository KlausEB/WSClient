package com.epam.WSClient.util.actions.impl;

import com.epam.WSClient.App;
import com.epam.WSClient.util.RequestUtil;
import com.epam.WSClient.util.actions.UserAction;
import org.jboss.resteasy.client.jaxrs.ResteasyWebTarget;

import java.io.BufferedReader;
import java.io.IOException;

public class AddAuthorAction implements UserAction {
    public static final String AUTHOR_MESSAGE = "Input author name:";

    public static final String SERVICE_PATH = BOOK_CONTROLLER_PATH + "/addAuthor/";

    @Override
    public void execute(BufferedReader reader) throws IOException {
        System.out.println(AUTHOR_MESSAGE);
        String authorName = reader.readLine();
        ResteasyWebTarget target = App.client.target(SERVICE_PATH + authorName);
        System.out.println(RequestUtil.post(null, target));
    }
}
