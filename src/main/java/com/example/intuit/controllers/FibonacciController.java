package com.example.intuit.controllers;

import com.example.intuit.services.FibonacciService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
public class FibonacciController {

    private final FibonacciService service;

    public FibonacciController(FibonacciService service) {
        this.service = service;
    }

    @GetMapping(value = "/fibonacci", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<Long> streamFibonacci() {
        return service.fibonacciStream();
    }
}

