package net.egv.goratings;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class GoratingsApplication {

    public static void main(String[] args) {
        SpringApplication.run(GoratingsApplication.class, args);
    }

}
