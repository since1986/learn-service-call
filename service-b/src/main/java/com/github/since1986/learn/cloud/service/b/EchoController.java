package com.github.since1986.learn.cloud.service.b;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/echo")
@RestController
public class EchoController {

    private final EchoService echoService;

    @Autowired
    public EchoController(EchoService echoService) {
        this.echoService = echoService;
    }

    @GetMapping
    public ResponseEntity get(long id, boolean showTimestamp) {
        return ResponseEntity.ok(echoService.get(id, showTimestamp));
    }
}
