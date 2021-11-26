package com.example.httpserverclientgenerator;

import org.springframework.web.client.RestTemplate;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class RestControllerClientInvocationHandler<T extends RestControllerDefinition> implements InvocationHandler {
    private final Class<T> restControllerDefinition;
    private final RestTemplate restTemplate;
    private final RestClientConfig restClientConfig;

    public RestControllerClientInvocationHandler(Class<T> restControllerDefinition, RestTemplate restTemplate, RestClientConfig restClientConfig) {
        this.restControllerDefinition = restControllerDefinition;
        this.restTemplate = restTemplate;
        this.restClientConfig = restClientConfig;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Method restControllerDefinitionMethod = restControllerDefinition.getMethod(method.getName());
        return new RestTemplateMethodInvoker(restTemplate, restClientConfig, restControllerDefinitionMethod).invoke();
    }
}
