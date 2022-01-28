package com.epam.WSClient.util.actions;

import java.io.BufferedReader;
import java.io.IOException;

public interface UserAction {
    void execute(BufferedReader reader) throws IOException;
}
