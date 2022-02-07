package com.epam.WSClient.util.actions.impl;

import com.epam.WSClient.util.actions.UserAction;
import com.epam.architecture.soapws.impl.UserSOAPService;
import com.epam.architecture.soapws.impl.UserSOAPServiceImplService;

import java.io.BufferedReader;
import java.io.IOException;

public class SaveDataAction implements UserAction {

    UserSOAPService userService = new UserSOAPServiceImplService().getUserSOAPServiceImplPort();

    @Override
    public void execute(BufferedReader reader) throws IOException {
        userService.save();
    }
}
