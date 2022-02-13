package com.epam.WSClient.util.actions;

import com.epam.WSClient.App;

import java.io.BufferedReader;
import java.io.IOException;

public interface UserAction {
    String ADMIN_CONTROLLER_PATH = App.WS_URL + "/admin";
    String BOOK_CONTROLLER_PATH = App.WS_URL + "/book";
    String SEARCH_CONTROLLER_PATH = App.WS_URL + "/search";
    String USER_CONTROLLER_PATH = App.WS_URL + "/user";

    void execute(BufferedReader reader) throws IOException;
}
