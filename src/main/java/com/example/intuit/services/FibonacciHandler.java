package com.example.intuit.services;

import org.springframework.stereotype.Component;
import org.springframework.web.reactive.socket.WebSocketHandler;
import org.springframework.web.reactive.socket.WebSocketSession;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.Duration;

@Component
public class FibonacciHandler implements WebSocketHandler {

    @Override
    public Mono<Void> handle(WebSocketSession session) {
        // Explicitly declare type parameter for generate
        Flux<String> fibonacciFlux = Flux.<String, long[]>generate(
                () -> new long[]{0L, 1L},   // state: Fibonacci sequence
                (state, sink) -> {
                    sink.next(String.valueOf(state[0]));  // emit as String
                    long next = state[0] + state[1];
                    state[0] = state[1];
                    state[1] = next;
                    return state;
                }
        ).delayElements(Duration.ofSeconds(1));

        // Convert Flux<String> -> Flux<WebSocketMessage>
        return session.send(fibonacciFlux.map(session::textMessage));
    }
}
