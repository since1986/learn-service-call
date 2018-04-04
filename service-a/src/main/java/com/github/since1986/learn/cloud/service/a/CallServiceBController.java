package com.github.since1986.learn.cloud.service.a;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/call")
@RestController
public class CallServiceBController {

    private final B b;

    @Autowired
    public CallServiceBController(B b) {
        this.b = b;
    }

    @GetMapping
    public ResponseEntity get() {
        return ResponseEntity.ok(b.getEcho(System.nanoTime(), true));
    }
}
