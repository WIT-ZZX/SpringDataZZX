package com.wit.zzx.utils;

import org.springframework.http.HttpStatus;


public class HttpException extends Exception {
    public HttpException(){}
    private HttpStatus httpStatus;

    public HttpStatus getHttpStatus() {
        return httpStatus;
    }

    public HttpException(HttpStatus status, String message){
        super(message);
        this.httpStatus =status;
    }

    public String getJsonMessage()
    {
        return this.getMessage();
    }

    public String getJsonMsg()
    {
        return String.format("{\"error\": \"%s\"}", this.getMessage());
    }
}
