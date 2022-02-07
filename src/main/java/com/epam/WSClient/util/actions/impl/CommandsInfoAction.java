package com.epam.WSClient.util.actions.impl;

import com.epam.WSClient.util.CommandsEnum;
import com.epam.WSClient.util.actions.UserAction;

import java.io.BufferedReader;
import java.io.IOException;

public class CommandsInfoAction implements UserAction {

    @Override
    public void execute(BufferedReader reader) throws IOException {
        for (CommandsEnum currentCommand : CommandsEnum.values()) {
            if (!currentCommand.equals(CommandsEnum.LOGIN) && !currentCommand.equals(CommandsEnum.COMMANDS_INFO)) {
                System.out.println(currentCommand);
            }
        }
    }
}
