package client.two;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

@SpringBootApplication
public class Client2Application {
    public static void main(final String[] args) {
        SpringApplication.run(Client2Application.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(final ApplicationContext ctx) {
        return args -> {

            System.out.println("Let's inspect the beans provided by Spring Boot:");

            final String[] beanNames = ctx.getBeanDefinitionNames();
            Arrays.sort(beanNames);
            for (final String beanName : beanNames) {
                System.out.println(beanName);
            }

        };
    }
}
