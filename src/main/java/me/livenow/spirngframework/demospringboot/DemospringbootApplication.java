package me.livenow.spirngframework.demospringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("classpath:/app.properties")
public class DemospringbootApplication {
    public static void main(String[] args) {
        SpringApplication.run(DemospringbootApplication.class, args);
    }

}
