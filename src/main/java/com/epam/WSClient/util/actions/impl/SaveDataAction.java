package com.epam.WSClient.util.actions.impl;

import com.epam.WSClient.App;
import com.epam.WSClient.util.SaveJWTTokenCookie;
import com.epam.WSClient.util.actions.UserAction;
import org.jboss.resteasy.client.jaxrs.ResteasyWebTarget;

import javax.ws.rs.core.Cookie;
import javax.ws.rs.core.Response;
import java.io.BufferedReader;
import java.io.IOException;

public class SaveDataAction implements UserAction {

    public static final String SERVICE_PATH = USER_CONTROLLER_PATH + "/save";

    @Override
    public void execute(BufferedReader reader) throws IOException {
        ResteasyWebTarget target = App.client.target(SERVICE_PATH);
        Cookie token = SaveJWTTokenCookie.getToken();
        try (Response response = target.request().cookie(token).post(null)) {
            System.out.println("DONE");
        }
    }
}
