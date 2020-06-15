package gkdev.framework.spring5jokeapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:chuck-config.xml")
public class Spring5JokeappApplication {

    public static void main(String[] args) {
        SpringApplication.run(Spring5JokeappApplication.class, args);
    }

}
