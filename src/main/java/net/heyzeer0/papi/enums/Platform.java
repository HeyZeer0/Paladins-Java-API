package net.heyzeer0.papi.enums;

/**
 * Created by HeyZeer0 on 18/07/17.
 * Copyright © HeyZeer0 - 2016 ~ 2017
 */
public enum Platform {

    XBOX("http://api.xbox.paladins.com/paladinsapi.svc"),
    PS4("http://api.ps4.paladins.com/paladinsapi.svc"),
    PC("http://api.paladins.com/paladinsapi.svc"),
    SWITCH("http://api.xbox.paladins.com/paladinsapi.svc");

    String url;

    Platform(String x) {
        url = x;
    }

    public String getUrl() {
        return url;
    }

}
