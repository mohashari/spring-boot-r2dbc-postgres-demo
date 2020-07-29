package me.muklis.demospringr2dbc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.r2dbc.repository.config.EnableR2dbcRepositories;

@SpringBootApplication
@EnableR2dbcRepositories(basePackages = "me.muklis.demospringr2dbc.repo")
public class DemoSpringR2dbcApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoSpringR2dbcApplication.class, args);
    }

}
