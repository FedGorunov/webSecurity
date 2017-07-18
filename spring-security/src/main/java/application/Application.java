package application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


/**
 * Created by Fedor on 18.07.2017.
 */
@SpringBootApplication
@ComponentScan("webConfig")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
