package com.epam.WSClient.util;

import javax.ws.rs.core.Cookie;

public class SaveJWTTokenCookie {
    private static Cookie token = new Cookie("jwtToken", "none");

    public static Cookie getToken() {
        return token;
    }

    public static void setToken(Cookie token) {
        SaveJWTTokenCookie.token = token;
    }

    public static void setToken(String name, String token) {
        SaveJWTTokenCookie.token = new Cookie(name, token);
    }
}
