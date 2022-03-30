package com.example.demo.jwt.dto.reponse;

import lombok.Data;


public class MessageResponse {
    private String message;

    public MessageResponse() {
    }

    public MessageResponse(String message) {
        this.message = message;
    }


}
