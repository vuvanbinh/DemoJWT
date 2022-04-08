package com.example.demo.jwt.controllers;

import com.example.demo.jwt.dto.reponse.MessageResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/access")
public class AccessController {

    @GetMapping("/all")
    public ResponseEntity<?> allAccess(){
        return ResponseEntity.ok(new MessageResponse("Access to 'api/test/all' success!"));
    }
}
