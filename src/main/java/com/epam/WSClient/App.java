package com.epam.WSClient;


import com.epam.WSClient.util.actions.UserAction;
import com.epam.WSClient.util.actions.UserActionFactory;
import org.jboss.resteasy.client.jaxrs.ResteasyClient;
import org.jboss.resteasy.client.jaxrs.ResteasyClientBuilder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
    public static final String WS_URL = "http://localhost:8080/JavaDesignAndArchitecture_war_exploded/rest";
    public static ResteasyClient client;

    public static void main(String[] args) {
        client = new ResteasyClientBuilder().build();
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            while (true) {
                String command = reader.readLine();
                if (command.equals("STOP")) {
                    break;
                }
                UserAction currentAction = UserActionFactory.parseCommand(command);
                currentAction.execute(reader);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
