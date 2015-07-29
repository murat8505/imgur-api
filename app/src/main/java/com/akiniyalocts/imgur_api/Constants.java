package com.akiniyalocts.imgur_api;

/**
 * Holds constant information about the imgur api like version and base url
 */
public class Constants {
    public static final String API_BASE_URL = "https://api.imgur.com/3/";

    public static final String IMGUR_REDIRECT_URL = "http://android";

    public static final String IMGUR_GRANT_TYPE = "refresh_token";

    public static final String AUTH_BEARER = "Bearer ";

    public static final String AUTH_CLIENT = "Client-ID ";

    public static String CLIENT_ID;

    public static final String OAUTH_URL = "https://api.imgur.com/oauth2/authorize?client_id=";

    public static String getClientId() {
        return CLIENT_ID;
    }

    public static void setClientId(String clientId) {
        CLIENT_ID = clientId;
    }

    public static String getGeneratedAuthURL() {
        return Constants.OAUTH_URL + Constants.getClientId() + "&response_type=token";
    }

    public static String getBearerAuth(){
        return null;
    }


}
