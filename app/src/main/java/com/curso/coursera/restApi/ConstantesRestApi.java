package com.curso.coursera.restApi;

public final class ConstantesRestApi {
    public static final String VERSION = "/v1/";
    public static final String ROOT_URL = "https://api.instagram.com" + VERSION;
    public static final String ACCES_TOKEN = "s4uir54oj5oii49309o.3o489u094ui50.44o59u0394u05oui93.45oliiw3u8u48hr" + VERSION;
    public static final String KEY_ACCES_TOKEN = "?acces_token";
    public static final String KEY_GET_RECENT_MEDIA_USER = "user/self/media/recent";
    public static final String URL_GET_RECENT_MEDIA_USER = KEY_GET_RECENT_MEDIA_USER + KEY_ACCES_TOKEN + ACCES_TOKEN;
}
