package com.epam.WSClient.util.actions.impl;


import com.epam.WSClient.App;
import com.epam.WSClient.dto.BookDTO;
import com.epam.WSClient.util.RequestUtil;
import com.epam.WSClient.util.actions.UserAction;
import org.jboss.resteasy.client.jaxrs.ResteasyWebTarget;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.List;

public class SearchBooksByAuthorAction implements UserAction {
    public static final String PART_NAME_MESSAGE = "Input part of the name:";

    public static final String SERVICE_PATH = SEARCH_CONTROLLER_PATH + "/booksByAuthorName/";

    @Override
    public void execute(BufferedReader reader) throws IOException {
        System.out.println(PART_NAME_MESSAGE);
        String partName = reader.readLine();
        ResteasyWebTarget target = App.client.target(SERVICE_PATH + partName);
        List<BookDTO> books = RequestUtil.get(List.class, target);
        System.out.println(books);
    }
}
