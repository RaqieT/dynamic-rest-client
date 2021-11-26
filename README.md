# Dynamic REST Client
Example controller definition:
```java
public interface ExampleRestControllerDefinition extends RestControllerDefinition {
    @GetMapping
    String hello();

    @GetMapping("/world")
    String world();
}
```

Example controller:
```java
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
```

Example REST client:
```java
@Component
public class ExampleRestClient extends RestControllerClient<ExampleRestControllerDefinition> {
    public ExampleRestClient(RestTemplateBuilder restTemplateBuilder) {
        super(ExampleRestControllerDefinition.class, restTemplateBuilder);
    }
}
```

Example usage:
```java
	@Bean
	CommandLineRunner runner(ExampleRestClient exampleRestClient) {
		return args -> {
			System.out.println(exampleRestClient.client().hello());
			System.out.println(exampleRestClient.client().world());
		};
	}
```
