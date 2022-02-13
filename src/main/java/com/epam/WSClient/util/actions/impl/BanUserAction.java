package com.epam.WSClient.util.actions.impl;

import com.epam.WSClient.App;
import com.epam.WSClient.util.RequestUtil;
import com.epam.WSClient.util.actions.UserAction;
import org.jboss.resteasy.client.jaxrs.ResteasyWebTarget;

import java.io.BufferedReader;
import java.io.IOException;

public class BanUserAction implements UserAction {
    public static final String LOGIN_REQUEST_MESSAGE = "Input login:";

    public static final String SERVICE_PATH = ADMIN_CONTROLLER_PATH + "/user/";

    @Override
    public void execute(BufferedReader reader) throws IOException {
        System.out.println(LOGIN_REQUEST_MESSAGE);
        String deleteLogin = reader.readLine();
        ResteasyWebTarget target = App.client.target(SERVICE_PATH + deleteLogin);
        System.out.println(RequestUtil.delete(target));
    }
}
