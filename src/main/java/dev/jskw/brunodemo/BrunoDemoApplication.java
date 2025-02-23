package dev.jskw.brunodemo;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@OpenAPIDefinition(info = @Info(title = "BrunoDemo", version = "0.0.1"))
@SpringBootApplication
public class BrunoDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(BrunoDemoApplication.class, args);
    }

}
