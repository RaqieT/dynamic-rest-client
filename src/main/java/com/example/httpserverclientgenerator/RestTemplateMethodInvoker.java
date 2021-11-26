package com.example.httpserverclientgenerator;

import org.springframework.web.client.RestTemplate;

import java.lang.reflect.Method;

public class RestTemplateMethodInvoker {
    private final RestTemplate restTemplate;
    private final RestClientConfig restClientConfig;
    private final Method restControllerClientMethod;

    public RestTemplateMethodInvoker(RestTemplate restTemplate, RestClientConfig restClientConfig, Method restControllerClientMethod) {
        this.restTemplate = restTemplate;
        this.restClientConfig = restClientConfig;
        this.restControllerClientMethod = restControllerClientMethod;
    }

    public Object invoke() {
        // TODO: implement
        System.out.println("INVOKED!");
        return null;
    }
}
