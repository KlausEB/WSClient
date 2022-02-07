package com.epam.WSClient.util;

public class SaveUserService {
    private static String login;
    private static String password;

    public static void saveUserData(String login, String password) {
        SaveUserService.login = login;
        SaveUserService.password = password;
    }

    public static String getLogin() {
        return login;
    }

    public static String getPassword() {
        return password;
    }
}
