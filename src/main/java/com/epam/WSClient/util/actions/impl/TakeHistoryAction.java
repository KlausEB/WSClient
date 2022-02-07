package com.epam.WSClient.util.actions.impl;

import com.epam.WSClient.util.actions.UserAction;
import com.epam.architecture.soapws.impl.AdminSOAPService;
import com.epam.architecture.soapws.impl.AdminSOAPServiceImplService;

import java.io.BufferedReader;
import java.io.IOException;

public class TakeHistoryAction implements UserAction {

    AdminSOAPService adminService = new AdminSOAPServiceImplService().getAdminSOAPServiceImplPort();

    @Override
    public void execute(BufferedReader reader) throws IOException {
        System.out.println(adminService.takeHistory());
    }
}
