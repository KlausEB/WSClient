package com.epam.WSClient.util.actions.impl;

import com.epam.WSClient.App;
import com.epam.WSClient.util.RequestUtil;
import com.epam.WSClient.util.actions.UserAction;
import org.jboss.resteasy.client.jaxrs.ResteasyWebTarget;

import java.io.BufferedReader;
import java.io.IOException;

public class TakeHistoryAction implements UserAction {

    public static final String SERVICE_PATH = ADMIN_CONTROLLER_PATH + "/history";

    @Override
    public void execute(BufferedReader reader) throws IOException {
        ResteasyWebTarget target = App.client.target(SERVICE_PATH);
        String history = RequestUtil.get(String.class, target);
    }
}
