package com.chatbot.demo;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

@SpringBootApplication
@OpenAPIDefinition
@Slf4j
public class AIChatBotDemoApplication {
    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication(AIChatBotDemoApplication.class);
        Environment environment = springApplication.run(args).getEnvironment();
        log.info("Application '{}' is running! Access URLs: Local: http://localhost:{} ",
                environment.getProperty("spring.application.name"),
                environment.getProperty("server.port"));
    }
}
