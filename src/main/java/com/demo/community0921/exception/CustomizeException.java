package com.demo.community0921;

public class CustomizeException extends RuntimeException {
    private String message;
    public CustomizeException(String message){
        this.message=message;
    }
    @Override
    public String getMessage(){
        return message;
    }
    
}
