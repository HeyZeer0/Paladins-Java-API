package net.heyzeer0.papi.enums;

/**
 * Created by HeyZeer0 on 19/07/17.
 * Copyright © HeyZeer0 - 2016 ~ 2017
 */
public enum Language {

    ENGLISH(1),
    GERMAN(2),
    FRENCH(3),
    SPANISH(7),
    SPANISH_LATIN_AMERICA(9),
    PORTUGUESE(10),
    RUSSIAN(11),
    POLISH(12),
    TURKISH(13);

    int value;

    Language(int x) {
        value = x;
    }

    public int getValue() {
        return value;
    }

}
