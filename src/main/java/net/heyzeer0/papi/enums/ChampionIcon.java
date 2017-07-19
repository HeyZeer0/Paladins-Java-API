package net.heyzeer0.papi.enums;

/**
 * Created by HeyZeer0 on 19/07/17.
 * Copyright © HeyZeer0 - 2016 ~ 2017
 */
public enum ChampionIcon {

    ASH("https://web2.hirez.com/paladins//wp-content/uploads/2017/06/SteamProfile_Ash.png"),
    BARIK("https://web2.hirez.com/paladins/wp-content/uploads/2016/07/0012_BArik.jpg"),
    FERNANDO("https://web2.hirez.com/paladins/wp-content/uploads/2015/09/Fernando_NewPort_02.png"),
    INARA("https://web2.hirez.com/paladins//wp-content/uploads/2017/03/OB45-Inara-Profile-WEB-184x184.jpg"),
    MAKOA("https://web2.hirez.com/paladins/wp-content/uploads/2016/08/Makoa_Port_v01.png"),
    RUCKUS("https://web2.hirez.com/paladins/wp-content/uploads/2016/07/0011_Ruckus.jpg"),
    TORVALD("https://web2.hirez.com/paladins//wp-content/uploads/2017/01/Profile_Forum_Torvald_80x80.jpg"),
    BOMB_KING("https://web2.hirez.com/paladins/wp-content/uploads/2016/07/0005_BombKing.jpg"),
    CASSIE("https://web2.hirez.com/paladins/wp-content/uploads/2016/09/0000_Cassie_.jpg"),
    DROGOZ("https://web2.hirez.com/paladins/wp-content/uploads/2016/07/0001_Drogoz.jpg"),
    KINESSA("https://web2.hirez.com/paladins/wp-content/uploads/2016/07/0014_Kanissa.jpg"),
    LIAN("https://web2.hirez.com/paladins//wp-content/uploads/2017/06/SteamProfile_Ash.png"),
    SHA_LIN("https://web2.hirez.com/paladins//wp-content/uploads/2016/11/Profile-ShaLin.jpg"),
    TYRA("https://web2.hirez.com/paladins//wp-content/uploads/2016/12/Tyra_Profile_Forum_80x80.png"),
    VIKTOR("https://web2.hirez.com/paladins/wp-content/uploads/2016/07/ChampPortrait_Viktor.jpg"),
    WILLO("https://web2.hirez.com/paladins//wp-content/uploads/2017/05/Steam_Profile_Willo_184x184.jpg"),
    GROHK("https://web2.hirez.com/paladins/wp-content/uploads/2016/07/0007_Grohk.jpg"),
    GROVER("https://web2.hirez.com/paladins/wp-content/uploads/2016/07/0010_Grover.jpg"),
    MALDAMBA("https://web2.hirez.com/paladins//wp-content/uploads/2016/10/maldamba-icon.jpg"),
    PIP("https://web2.hirez.com/paladins/wp-content/uploads/2016/07/0002_Pip.jpg"),
    SERIS("https://web2.hirez.com/paladins/wp-content/uploads/2017/05/Seris_184x184.jpg"),
    YING("https://web2.hirez.com/paladins/wp-content/uploads/2016/07/0003_Ying.jpg"),
    BUCK("https://web2.hirez.com/paladins/wp-content/uploads/2015/09/Buck_NewPort_03.png"),
    EVIE("https://web2.hirez.com/paladins/wp-content/uploads/2016/07/0006_Evie.jpg"),
    LEX("https://web2.hirez.com/paladins//wp-content/uploads/2017/03/Steam_Profile_Lex_184.jpg"),
    MEAVE("https://web2.hirez.com/paladins//wp-content/uploads/2017/02/Portrait_Maeve_184x184.jpg"),
    SKYE("https://web2.hirez.com/paladins/wp-content/uploads/2015/09/Skye_NewPort_02.png"),
    ZHIN("https://web2.hirez.com/paladins//wp-content/uploads/2017/06/SteamProfile_Zhin.png"),
    ANDROXUS("https://web2.hirez.com/paladins/wp-content/uploads/2016/07/0004_Androxus.jpg");

    String url;

    ChampionIcon(String x) {
        url = x;
    }

    public String getUrl() {
        return url;
    }

}
