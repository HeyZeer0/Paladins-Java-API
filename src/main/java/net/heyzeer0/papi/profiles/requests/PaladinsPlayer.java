package net.heyzeer0.papi.profiles.requests;

import org.json.JSONObject;

/**
 * Created by HeyZeer0 on 18/07/17.
 * Copyright © HeyZeer0 - 2016 ~ 2017
 */
public class PaladinsPlayer {

    int id;
    int leaves;
    int level;
    int losses;
    int mastery_level;
    String name;
    String status;
    String region;
    int total_archievements;
    int total_worshippers;
    int wins;
    String join_date;
    String last_login;

    public PaladinsPlayer(JSONObject json) {
        System.out.println(json.toString());
        id = json.getInt("Id");
        leaves = json.getInt("Leaves");
        level = json.getInt("Level");
        losses = json.getInt("Losses");
        mastery_level = json.getInt("MasteryLevel");
        name = (String)json.get("Name");
        status = (String)json.get("Personal_Status_Message");
        region = (String)json.get("Region");
        total_archievements = json.getInt("Total_Achievements");
        total_worshippers = json.getInt("Total_Worshippers");
        wins = json.getInt("Wins");
        join_date = (String)json.get("Created_Datetime");
        last_login = (String)json.get("Last_Login_Datetime");
    }

    public int getID() {
        return id;
    }

    public int getLeaves() {
        return leaves;
    }

    public int getLevel() {
        return level;
    }

    public int getLosses() {
        return losses;
    }

    public int getMasteryLevel() {
        return mastery_level;
    }

    public String getName() {
        return name;
    }

    public String getStatus() {
        return status;
    }

    public String getRegion() {
        return region;
    }

    public int getTotalArchievements() {
        return total_archievements;
    }

    public int getTotalWorshippers() {
        return total_worshippers;
    }

    public int getWins() {
        return wins;
    }

    public String getJoinDate() {
        return join_date;
    }

    public String getLastLogin() {
        return last_login;
    }

    @Override
    public String toString() {
        return getName() + "|" + getID() + "|" + getLevel() + "|" + getWins() + "|" + getLosses() + "|" + getRegion() + "|" + getLeaves() + "|" + getMasteryLevel() + "|" + getStatus() + "|" + getTotalArchievements() + "|" + getTotalWorshippers() + "|" + getLastLogin() + "|" + getJoinDate();
    }

}
