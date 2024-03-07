package com.example.securingweb.filter;

import java.io.Serializable;

public class JwtResponse implements Serializable {

    private static final long serialVersionUID = -8091879091924046844L;
    private final String jwttoken;
    private final String tokenType = "Bearer";
    public JwtResponse(String jwttoken) {
        this.jwttoken = jwttoken;
    }

    public String getToken() {
        return this.jwttoken;
    }

    public String geTokenType() {
        return this.tokenType;
    }
}