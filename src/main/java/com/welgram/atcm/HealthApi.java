package com.welgram.atcm;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HealthApi {


    @GetMapping(value = {"/welcome", "/health"})
    public @ResponseBody
    ResponseEntity<?> welcome() {

        return new ResponseEntity<>(HttpStatus.OK);

    }

}

