package net.heyzeer0.papi.exceptions;

/**
 * Created by HeyZeer0 on 19/07/17.
 * Copyright © HeyZeer0 - 2016 ~ 2017
 */
public class UnknowPlayerException extends Exception {

    public UnknowPlayerException() {
        super("the defined player does not exist");
    }

}
