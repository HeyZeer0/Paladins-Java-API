package net.heyzeer0.papi;

import net.heyzeer0.papi.enums.Platform;
import net.heyzeer0.papi.manager.RequestManager;
import okhttp3.OkHttpClient;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

/**
 * Created by HeyZeer0 on 18/07/17.
 * Copyright © HeyZeer0 - 2016 ~ 2017
 */
public class PaladinsAPI {

    String dev_id;
    String auth_key;

    Platform platform;

    OkHttpClient httpClient = new OkHttpClient();
    SimpleDateFormat date = new SimpleDateFormat("yyyyMMddHHmmss");

    RequestManager requestManager;

    public PaladinsAPI(String dev_id, String auth_key, Platform platform) {
        this.dev_id = dev_id;
        this.auth_key = auth_key;
        this.platform = platform;

        date.setTimeZone(TimeZone.getTimeZone("UTC"));
        requestManager = new RequestManager(this);
    }

    public String getDevID() {
        return dev_id;
    }

    public String getSignature(String call) {
        return Utils.generateMd5(dev_id + call + auth_key + getDate());
    }

    public OkHttpClient getHttpClient() {
        return httpClient;
    }

    public String getDate() {
        return date.format(new Date());
    }

    public Platform getPlatform() {
        return platform;
    }

    public RequestManager getRequestManager() {
        return requestManager;
    }

}
