package com.epam.WSClient.util.actions;

import com.epam.architecture.soapws.impl.SOAPException;

import java.io.BufferedReader;
import java.io.IOException;

public interface UserAction {
    void execute(BufferedReader reader) throws IOException, SOAPException;
}
