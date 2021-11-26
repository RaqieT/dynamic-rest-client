package com.example.httpserverclientgenerator;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.web.client.RestTemplate;

public abstract class RestControllerClient<T extends RestControllerDefinition> {
    private final Class<T> dynamicRestControllerClass;
    private final RestTemplate restTemplate;
    private final RestClientConfig restClientConfig;

    public RestControllerClient(
            Class<T> restControllerClientDefinitionClass,
            RestTemplateBuilder restTemplateBuilder
    ) {
        this.dynamicRestControllerClass = restControllerClientDefinitionClass;
        this.restTemplate = restTemplateBuilder.build();
        this.restClientConfig = RestClientConfig.builder().build();
    }

    public RestControllerClient(Class<T> dynamicRestControllerClass,
                                RestTemplateBuilder restTemplateBuilder,
                                RestClientConfig restClientConfig) {
        this.dynamicRestControllerClass = dynamicRestControllerClass;
        this.restTemplate = restTemplateBuilder.build();
        this.restClientConfig = restClientConfig;
    }

    public RestTemplate getRestTemplate() {
        return restTemplate;
    }

    public T client() {
        return RestControllerClientGenerator
                .generate(dynamicRestControllerClass, restTemplate, restClientConfig);
    }
}
