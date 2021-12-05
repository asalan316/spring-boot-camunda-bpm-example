package com.ak.bpm;

import org.springframework.stereotype.Component;

@Component
public class Credentials {

    private static final String PASSWORD = "password123";
    private static final String USERNAME = "admin";

    public String getPASSWORD() {
        return PASSWORD;
    }

    public String getUSERNAME() {
        return USERNAME;
    }
}
