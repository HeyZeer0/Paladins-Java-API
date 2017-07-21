package net.heyzeer0.papi.profiles;

import net.heyzeer0.papi.PaladinsAPI;
import net.heyzeer0.papi.Utils;
import net.heyzeer0.papi.exceptions.SessionException;
import okhttp3.Request;
import org.json.JSONObject;

/**
 * Created by HeyZeer0 on 18/07/17.
 * Copyright © HeyZeer0 - 2016 ~ 2017
 */
public class Session {

    PaladinsAPI api;

    long time_left = 0;
    String session_id;
    boolean connected;

    public Session(PaladinsAPI api, String session_id) {
        this.api = api;
        this.session_id = session_id;
    }

    public Session(PaladinsAPI api) {
        this.api = api;
    }

    public void createSession() throws SessionException {
        try{
            JSONObject json = new JSONObject(api.getHttpClient().newCall(new Request.Builder().url(
                    Utils.generateUrl("createsession", api, false)
            ).build()).execute().body().string());


            if(json.getString("ret_msg").equalsIgnoreCase("Approved")) {
                session_id = json.getString("session_id");
                this.time_left = System.currentTimeMillis();
                connected = true;
            }else{
                throw new SessionException(json.getString("ret_msg"));
            }
        }catch (Exception e) {
            throw new SessionException(e.getLocalizedMessage());
        }
    }

    public String getSessionID() {
        return session_id;
    }

    public void reloadTime() {
        time_left = System.currentTimeMillis();
    }

    public boolean hasTimedout() {
        if(!isConnected()) {
            return false;
        }
        return ((System.currentTimeMillis() - time_left)/1000) >= 60*15;
    }

    public boolean isConnected() {
        return connected;
    }


}
