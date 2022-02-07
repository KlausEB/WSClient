package com.epam.WSClient.util.actions.impl;

import com.epam.WSClient.util.SaveUserService;
import com.epam.WSClient.util.actions.UserAction;

import java.io.BufferedReader;
import java.io.IOException;

public class LoginAction implements UserAction {
    public static final String LOGIN_REQUEST_MESSAGE = "Input login:";
    public static final String PASSWORD_REQUEST_MESSAGE = "Input password:";
    public static final String INVALID_ACCOUNT_DATA = "Invalid username or password";

    @Override
    public void execute(BufferedReader reader) throws IOException {
        System.out.println(LOGIN_REQUEST_MESSAGE);
        String login = reader.readLine();
        System.out.println(PASSWORD_REQUEST_MESSAGE);
        String password = reader.readLine();
        if (login != null || password != null) {
            SaveUserService.saveUserData(login, password);
        } else {
            System.out.println(INVALID_ACCOUNT_DATA);
        }
    }
}
