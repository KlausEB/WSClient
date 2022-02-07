package com.epam.WSClient;


import com.epam.WSClient.util.actions.UserAction;
import com.epam.WSClient.util.actions.UserActionFactory;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class App {
    private static final String WS_URL = "http://localhost:8082/ws/search?wsdl";

    public static void main(String[] args) throws Exception {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            while (true) {
                String command = reader.readLine();
                if (command.equals("STOP")) {
                    break;
                }
                UserAction currentAction = UserActionFactory.parseCommand(command);
                currentAction.execute(reader);
            }
        }
    }
}
