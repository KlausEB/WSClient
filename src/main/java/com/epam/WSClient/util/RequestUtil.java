package com.epam.WSClient.util;

import org.jboss.resteasy.client.jaxrs.ResteasyWebTarget;

import javax.ws.rs.client.Entity;
import javax.ws.rs.core.Cookie;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

public class RequestUtil {

    public static <T> T get(Class<T> clazz, ResteasyWebTarget target) {
        Cookie token = SaveJWTTokenCookie.getToken();
        try (Response response = target.request().cookie(token).get()) {
            return response.readEntity(clazz);
        }
    }

    public static String post(Object object, ResteasyWebTarget target) {
        Cookie token = SaveJWTTokenCookie.getToken();
        try (Response response = target.request().cookie(token).post(Entity.entity(object, MediaType.APPLICATION_JSON_TYPE))) {
            return response.readEntity(String.class);
        }
    }

    public static String delete(ResteasyWebTarget target) {
        Cookie token = SaveJWTTokenCookie.getToken();
        try (Response response = target.request().cookie(token).delete()) {
            return response.readEntity(String.class);
        }
    }
}
