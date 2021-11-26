package com.example.httpserverclientgenerator.example;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleRestController implements ExampleRestControllerDefinition {
    @Override
    public String hello() {
        return "hi";
    }

    @Override
    public String world() {
        return "world";
    }
}
