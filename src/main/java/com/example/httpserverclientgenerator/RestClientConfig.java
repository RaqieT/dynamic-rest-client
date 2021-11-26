package com.example.httpserverclientgenerator;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class RestClientConfig {
    @Builder.Default
    private final String url = "http://localhost:8080";
}
