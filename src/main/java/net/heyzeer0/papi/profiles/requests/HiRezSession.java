package net.heyzeer0.papi.profiles.requests;

import org.json.JSONObject;

/**
 * Created by HeyZeer0 on 19/07/17.
 * Copyright © HeyZeer0 - 2016 ~ 2017
 */
public class HiRezSession {

    int active_sessions;
    int max_concurrent_sessions;
    int request_limit_daily;
    int max_session_capacity;
    int session_time_limit;
    int total_request_today;
    int total_sessions_today;

    public HiRezSession(JSONObject json) {
        active_sessions = json.getInt("Active_Sessions");
        max_concurrent_sessions = json.getInt("Concurrent_Sessions");
        request_limit_daily = json.getInt("Request_Limit_Daily");
        max_session_capacity = json.getInt("Session_Cap");
        session_time_limit = json.getInt("Session_Time_Limit");
        total_request_today = json.getInt("Total_Requests_Today");
        total_sessions_today = json.getInt("Total_Sessions_Today");
    }

    public int getActiveSessions() {
        return active_sessions;
    }

    public int getMaxConcurrentSessions() {
        return max_concurrent_sessions;
    }

    public int getRequestLimitDaily() {
        return request_limit_daily;
    }

    public int getMaxSessionCapacity() {
        return max_session_capacity;
    }

    public int getSessionTimeLimit() {
        return session_time_limit;
    }

    public int getTotalRequestToday() {
        return total_request_today;
    }

    public int getTotalSessionsToday() {
        return total_sessions_today;
    }

    @Override
    public String toString() {
        return getActiveSessions() + "|" + getMaxConcurrentSessions() + "|" + getRequestLimitDaily() + "|" + getMaxSessionCapacity() + "|" + getSessionTimeLimit() + "|" + getTotalRequestToday() + "|" + getTotalRequestToday() + "|" + getTotalSessionsToday();
    }

}
