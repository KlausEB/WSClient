package com.epam.WSClient.util.actions;

import com.epam.WSClient.util.CommandsEnum;

public class UserActionFactory {
    public static UserAction parseCommand(String stringCommand) {
        CommandsEnum currentCommand = CommandsEnum.valueOf(stringCommand);
        return currentCommand.getUserAction();
    }
}
