package com.nc.docker.demo.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("api/v1/hellos")
public class HelloApi {

    @GetMapping
    public ResponseEntity<HelloDto> hello() {
        return ResponseEntity.ok().body(HelloDto.builder().message("hello!").uuid(UUID.randomUUID().toString()).build());
    }

}
