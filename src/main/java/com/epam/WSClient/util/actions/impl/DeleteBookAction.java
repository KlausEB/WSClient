package com.epam.WSClient.util.actions.impl;

import com.epam.WSClient.App;
import com.epam.WSClient.util.RequestUtil;
import com.epam.WSClient.util.actions.UserAction;
import org.jboss.resteasy.client.jaxrs.ResteasyWebTarget;

import java.io.BufferedReader;
import java.io.IOException;

public class DeleteBookAction implements UserAction {
    public static final String ISBN_MESSAGE = "Input ISBN:";

    public static final String SERVICE_PATH = BOOK_CONTROLLER_PATH + "/delete/";

    @Override
    public void execute(BufferedReader reader) throws IOException {
        System.out.println(ISBN_MESSAGE);
        String bookISBN = reader.readLine();
        ResteasyWebTarget target = App.client.target(SERVICE_PATH + bookISBN);
        System.out.println(RequestUtil.delete(target));
    }
}
