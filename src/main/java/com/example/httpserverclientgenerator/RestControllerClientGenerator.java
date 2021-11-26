package com.example.httpserverclientgenerator;

import org.springframework.web.client.RestTemplate;

import java.lang.reflect.Proxy;

public class RestControllerClientGenerator {
    private RestControllerClientGenerator() {

    }

    public static <T extends RestControllerDefinition> T generate(
            Class<T> restControllerDefinition,
            RestTemplate restTemplate,
            RestClientConfig restClientConfig
    ) {
        return (T) Proxy.newProxyInstance(
                    restControllerDefinition.getClassLoader(),
                    new java.lang.Class[] { restControllerDefinition },
                    new RestControllerClientInvocationHandler(restControllerDefinition, restTemplate, restClientConfig)
                );
    }
}
