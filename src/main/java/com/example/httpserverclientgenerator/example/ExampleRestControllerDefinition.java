package com.example.httpserverclientgenerator.example;

import com.example.httpserverclientgenerator.RestControllerDefinition;
import org.springframework.web.bind.annotation.GetMapping;

public interface ExampleRestControllerDefinition extends RestControllerDefinition {
    @GetMapping
    String hello();

    @GetMapping("/world")
    String world();
}
