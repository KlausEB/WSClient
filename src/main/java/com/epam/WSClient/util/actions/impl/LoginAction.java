package com.epam.WSClient.util.actions.impl;

import com.epam.WSClient.App;
import com.epam.WSClient.dto.UserDTO;
import com.epam.WSClient.util.SaveJWTTokenCookie;
import com.epam.WSClient.util.actions.UserAction;
import org.jboss.resteasy.client.jaxrs.ResteasyWebTarget;

import javax.ws.rs.client.Entity;
import javax.ws.rs.core.Cookie;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.io.BufferedReader;
import java.io.IOException;

public class LoginAction implements UserAction {
    public static final String LOGIN_REQUEST_MESSAGE = "Input login:";
    public static final String PASSWORD_REQUEST_MESSAGE = "Input password:";
    public static final String INVALID_ACCOUNT_DATA = "Invalid username or password";

    public static final String SERVICE_PATH = USER_CONTROLLER_PATH + "/authorization";

    @Override
    public void execute(BufferedReader reader) throws IOException {
        System.out.println(LOGIN_REQUEST_MESSAGE);
        String login = reader.readLine();
        System.out.println(PASSWORD_REQUEST_MESSAGE);
        String password = reader.readLine();
        if (login != null || password != null) {
            ResteasyWebTarget target = App.client.target(SERVICE_PATH);
            try (Response response = target.request().post(Entity.entity(new UserDTO(login, password), MediaType.APPLICATION_JSON_TYPE))) {
                Cookie token = response.getCookies().get("jwtToken");
                SaveJWTTokenCookie.setToken(token);
            }
        } else {
            System.out.println(INVALID_ACCOUNT_DATA);
        }
    }
}