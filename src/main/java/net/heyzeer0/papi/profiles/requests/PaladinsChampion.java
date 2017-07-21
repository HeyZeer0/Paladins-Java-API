package net.heyzeer0.papi.profiles.requests;

import net.heyzeer0.papi.enums.ChampionIcon;
import org.json.JSONObject;

/**
 * Created by HeyZeer0 on 19/07/17.
 * Copyright © HeyZeer0 - 2016 ~ 2017
 */
public class PaladinsChampion {

    int assist;
    int deaths;
    int kills;
    int losses;
    int minionkills;
    int rank;
    int wins;
    int worshippers;
    String champion;
    String champion_id;
    String player_id;

    public PaladinsChampion(JSONObject obj) {
        assist = obj.getInt("Assists");
        deaths = obj.getInt("Deaths");
        kills = obj.getInt("Kills");
        losses = obj.getInt("Losses");

        minionkills = obj.getInt("MinionKills");
        rank = obj.getInt("Rank");
        wins = obj.getInt("Wins");
        worshippers = obj.getInt("Worshippers");
        champion = (String)obj.get("champion");
        champion_id = (String)obj.get("champion_id");
        player_id = (String)obj.get("player_id");
    }

    public ChampionIcon getIcon() {
        return ChampionIcon.valueOf(champion.toUpperCase().replace(" ", "_").replace("'", ""));
    }

    public int getAssist() {
        return assist;
    }

    public int getDeaths() {
        return deaths;
    }

    public int getKills() {
        return kills;
    }

    public int getLosses() {
        return losses;
    }

    public int getMinionkills() {
        return minionkills;
    }

    public int getRank() {
        return rank;
    }

    public int getWins() {
        return wins;
    }

    public int getWorshippers() {
        return worshippers;
    }

    public String getName() {
        return champion;
    }

    public String getID() {
        return champion_id;
    }

    public String getPlayerID() {
        return player_id;
    }

    @Override
    public String toString() {
        return getName() + "|" + getID() + "|" + getPlayerID() + "|" + getRank() + "|" + getWins() + "|" + getLosses() + "|" + getWorshippers() + "|" + getMinionkills() + "|" + getKills() + "|" + getDeaths() + "|" + getAssist();
     }

}
