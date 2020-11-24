package com.curso.coursera.restApi;

public final class ConstantesRestApi {
    public static final String VERSION = "/v1/";
    public static final String ROOT_URL = "https://api.instagram.com" + VERSION;
    public static final String ACCES_TOKEN = "EAAOQkfBTzwEBAIf2vMSdUPk7pMtELcUfcDdTsrdXbvDhbX1GJ2QPcLARSa7CmDRBhDcWJxkqg2lZCvFMW25zZCJzANF4VE1axpU1Lo61utAMXwTHHjmBZB986xys773pNyyJjEVyS01nPmuyDQpeGPeTvHHxynvyYvj0iHkWRG5xcx9jcC7" + VERSION;
    public static final String KEY_ACCES_TOKEN = "?acces_token";
    public static final String KEY_GET_RECENT_MEDIA_USER = "user/self/media/recent";
    public static final String URL_GET_RECENT_MEDIA_USER = KEY_GET_RECENT_MEDIA_USER + KEY_ACCES_TOKEN + ACCES_TOKEN;
}
