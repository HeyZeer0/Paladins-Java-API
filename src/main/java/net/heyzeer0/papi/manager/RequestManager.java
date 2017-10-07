package net.heyzeer0.papi.manager;

import net.heyzeer0.papi.PaladinsAPI;
import net.heyzeer0.papi.Utils;
import net.heyzeer0.papi.exceptions.SessionException;
import net.heyzeer0.papi.exceptions.UnknowPlayerException;
import net.heyzeer0.papi.profiles.Session;
import net.heyzeer0.papi.profiles.requests.HiRezSession;
import net.heyzeer0.papi.profiles.requests.PaladinsPlayer;
import net.heyzeer0.papi.profiles.requests.PaladinsChampion;
import net.heyzeer0.papi.profiles.requests.PlayerStatus;
import okhttp3.Request;
import org.json.JSONArray;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by HeyZeer0 on 18/07/17.
 * Copyright © HeyZeer0 - 2016 ~ 2017
 */
public class RequestManager {

    PaladinsAPI api;

    Session session;

    public RequestManager(PaladinsAPI api) {
        this.api = api;
    }

    public RequestManager applySession(String key) throws IOException, SessionException {
        session = new Session(api, key);
        if(getSessionStatus().contains("Invalid session id")) {
            session = null;
            throw new SessionException("invalid session id, maybe expired.");
        }
        getSession(false).reloadTime();
        return this;
    }

    public Session getSession(boolean load) throws SessionException {
        if(session == null || session.hasTimedout()) {
            session = new Session(api);
            if(load) session.createSession();
            return  session;
        }
        if(load) {
            session.reloadTime();
        }
        return session;
    }

    public String getSessionStatus() throws IOException {
        if(session != null) {
            return api.getHttpClient().newCall(new Request.Builder().url(Utils.generateUrl("testsession", api, true)).build()).execute().body().string();
        }
        return "not-connected";
    }

    public HiRezSession getDataUsed() throws IOException, SessionException {
        getSession(true);
        if(session != null) {
            JSONArray json = new JSONArray(api.getHttpClient().newCall(new Request.Builder().url(Utils.generateUrl("getdataused", api, true)).build()).execute().body().string());
            if(json.length() <= 0) {
                throw new SessionException("Invalid session");
            }

            return new HiRezSession(json.getJSONObject(0));
        }
        throw new SessionException("No session available");
    }

    public PaladinsPlayer requestPlayer(String nick) throws SessionException, IOException, UnknowPlayerException {
        getSession(true);
        JSONArray json = new JSONArray(api.getHttpClient().newCall(new Request.Builder().url(
                Utils.generateUrl("getplayer", api, true) + "/" + nick
        ).build()).execute().body().string());

        if(json.length() <= 0) {
            throw new UnknowPlayerException();
        }

        return new PaladinsPlayer(json.getJSONObject(0));
    }

    public List<PaladinsChampion> requestUserChampions(String nick) throws SessionException, IOException, UnknowPlayerException {
        getSession(true);
        JSONArray json = new JSONArray(api.getHttpClient().newCall(new Request.Builder().url(
                Utils.generateUrl("getchampionranks", api, true) + "/" + nick
        ).build()).execute().body().string());

        if(json.length() <= 0) {
            throw  new UnknowPlayerException();
        }

        ArrayList<PaladinsChampion> champions = new ArrayList<>();
        for(int i = 0; i < json.length(); i++) {
            champions.add(new PaladinsChampion(json.getJSONObject(i)));
        }

        return champions;
    }

    public PlayerStatus requestPlayerStatus(String nick) throws SessionException, IOException, UnknowPlayerException {
        getSession(true);
        JSONArray json = new JSONArray(api.getHttpClient().newCall(new Request.Builder().url(
                Utils.generateUrl("getplayerstatus", api, true) + "/" + nick
        ).build()).execute().body().string());

        if(json.length() <= 0) {
            throw  new UnknowPlayerException();
        }

        return new PlayerStatus(json.getJSONObject(0));
    }

}
