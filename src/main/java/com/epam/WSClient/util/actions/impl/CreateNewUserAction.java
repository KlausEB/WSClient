package com.epam.WSClient.util.actions.impl;

import com.epam.WSClient.App;
import com.epam.WSClient.dto.UserDTO;
import com.epam.WSClient.util.RequestUtil;
import com.epam.WSClient.util.actions.UserAction;
import org.jboss.resteasy.client.jaxrs.ResteasyWebTarget;

import java.io.BufferedReader;
import java.io.IOException;

public class CreateNewUserAction implements UserAction {
    public static final String LOGIN_REQUEST_MESSAGE = "Input login:";
    public static final String PASSWORD_REQUEST_MESSAGE = "Input password:";
    public static final String INVALID_ACCOUNT_DATA = "Invalid username or password";

    public static final String SERVICE_PATH = ADMIN_CONTROLLER_PATH + "/user";

    @Override
    public void execute(BufferedReader reader) throws IOException {
        System.out.println(LOGIN_REQUEST_MESSAGE);
        String login = reader.readLine();
        System.out.println(PASSWORD_REQUEST_MESSAGE);
        String password = reader.readLine();
        if (login != null || password != null) {
            ResteasyWebTarget target = App.client.target(SERVICE_PATH);
            System.out.println(RequestUtil.post(new UserDTO(login, password), target));
        } else {
            System.out.println(INVALID_ACCOUNT_DATA);
        }
    }
}
