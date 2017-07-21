package net.heyzeer0.papi.profiles.requests;


import net.heyzeer0.papi.exceptions.UnknowPlayerException;
import org.json.JSONObject;

/**
 * Created by HeyZeer0 on 21/07/17.
 * Copyright © HeyZeer0 - 2016 ~ 2017
 */
public class PlayerStatus {

    int status;
    int match_id;

    public PlayerStatus(JSONObject x) throws UnknowPlayerException {
        try{
            status = x.getInt("status");
            match_id = x.getInt("Match");
        }catch (Exception e) {
            throw new UnknowPlayerException();
        }
    }

    public Status getStatus() {
        return Status.getAsValue(status);
    }

    public int getMatchID() {
        return match_id;
    }

    public enum Status {

        OFFLINE(0),
        IN_LOBBY(1),
        CHAMPION_SELECTION(2),
        IN_GAME(3),
        ONLINE(4);

        int status;

        Status(int x) {
            status = x;
        }

        public int getStatus() {
            return status;
        }

        public static Status getAsValue(int x) {
            for(Status s : Status.values()) {
                if(s.getStatus() == x) {
                    return s;
                }
            }

            return null;
        }

    }

}
