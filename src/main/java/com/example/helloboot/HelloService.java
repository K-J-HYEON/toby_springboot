package com.example.helloboot;

public interface HelloService {
    String sayHello(String requireNonNull);

    default int countOf(String name) {
        return 0;
    }
}