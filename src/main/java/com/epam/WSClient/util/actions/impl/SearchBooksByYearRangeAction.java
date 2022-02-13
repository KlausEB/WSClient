package com.epam.WSClient.util.actions.impl;

import com.epam.WSClient.App;
import com.epam.WSClient.dto.BookDTO;
import com.epam.WSClient.util.RequestUtil;
import com.epam.WSClient.util.actions.UserAction;
import org.jboss.resteasy.client.jaxrs.ResteasyWebTarget;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.List;

public class SearchBooksByYearRangeAction implements UserAction {
    public static final String NUMBER_RANGE_MESSAGE = "Input min and max numbers:";

    public static final String SERVICE_PATH = SEARCH_CONTROLLER_PATH + "/booksByYearRange";

    @Override
    public void execute(BufferedReader reader) throws IOException {
        System.out.println(NUMBER_RANGE_MESSAGE);
        int minYear = Integer.parseInt(reader.readLine());
        int maxYear = Integer.parseInt(reader.readLine());
        ResteasyWebTarget target = App.client.target(SERVICE_PATH)
                .queryParam("minYear", minYear)
                .queryParam("maxYear", maxYear);
        List<BookDTO> books = RequestUtil.get(List.class, target);
        System.out.println(books);
    }
}
