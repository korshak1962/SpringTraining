package com.example.intuit.services;

import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

import java.time.Duration;

@Service
public class FibonacciService {

    public Flux<Long> fibonacciStream() {
        return Flux.generate(
                        () -> new long[]{0L, 1L},          // initial state
                        (state, sink) -> {
                            sink.next(state[0]);           // emit Long
                            long nextValue = state[0] + state[1];
                            state[0] = state[1];
                            state[1] = nextValue;
                            return state;
                        }
                ).map(n -> (Long) n)                     // cast Object -> Long
                .delayElements(Duration.ofSeconds(1)); // emit every 1 second
    }
}


