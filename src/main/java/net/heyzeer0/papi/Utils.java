package net.heyzeer0.papi;

import java.security.MessageDigest;

/**
 * Created by HeyZeer0 on 18/07/17.
 * Copyright © HeyZeer0 - 2016 ~ 2017
 */
public class Utils {

    public static String generateMd5(String key){
        try {
            StringBuilder sb = new StringBuilder();


            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(key.getBytes());
            byte bytes[] = md.digest();

            for (byte b : bytes) {
                String hx = Integer.toHexString(0xff & b);
                if (hx.length() == 1) sb.append("0");
                sb.append(hx);
            }
            return sb.toString();
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }

    public static String generateUrl(String method, PaladinsAPI api, boolean session) {
        try{
            return api.getPlatform().getUrl() + "/" + method + "Json/"  + api.getDevID() + "/" + api.getSignature(method) + "/" + (session ? api.getRequestManager().getSession(true).getSessionID() + "/" : "") + api.getDate();
        }catch (Exception e) {
            e.printStackTrace();
            return "failed_to_get_session";
        }
    }

}
