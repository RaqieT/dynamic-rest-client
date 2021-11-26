package com.example.httpserverclientgenerator.example;

import com.example.httpserverclientgenerator.RestControllerClient;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Component;

@Component
public class ExampleRestClient extends RestControllerClient<ExampleRestControllerDefinition> {
    public ExampleRestClient(RestTemplateBuilder restTemplateBuilder) {
        super(ExampleRestControllerDefinition.class, restTemplateBuilder);
    }
}
