package com.mba.katafoobar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;


@SpringBootApplication
public class KataFooBarApplication {

    public static void main(String[] args) {
        SpringApplication.run(KataFooBarApplication.class, args);
    }

    @Bean
    public Docket schoolApi() {
        return new Docket(DocumentationType.SWAGGER_2).
                select().
                apis(RequestHandlerSelectors.basePackage("com.mba.katafoobar")).
                paths(PathSelectors.any()).
                build();
    }
}
