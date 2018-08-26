package net.heyzeer0.papi.enums;

/**
 * Created by HeyZeer0 on 19/07/17.
 * Copyright © HeyZeer0 - 2016 ~ 2017
 */
public enum ChampionIcon {

    ASH,
    BARIK,
    FERNANDO,
    INARA,
    MAKOA,
    RUCKUS,
    TORVALD,
    BOMB_KING,
    CASSIE,
    DROGOZ,
    KINESSA,
    LIAN,
    SHA_LIN,
    TYRA,
    VIKTOR,
    WILLO,
    GROHK,
    GROVER,
    MALDAMBA,
    PIP,
    SERIS,
    YING,
    BUCK,
    EVIE,
    LEX,
    MAEVE,
    SKYE,
    ZHIN,
    STRIX,
    TALUS,
    ANDROXUS,
    FURIA,
    MOJI,
    KHAN,
    KOGA;

    ChampionIcon() {

    }

    public String getUrl() {
        return "https://web2.hirez.com/paladins/champion-icons/" + toString().toLowerCase().replace("_", "-") + ".jpg";
    }

}
