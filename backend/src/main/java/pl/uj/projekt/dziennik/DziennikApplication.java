package pl.uj.projekt.dziennik;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class DziennikApplication {

    public static void main(String[] args) {
        SpringApplication.run(DziennikApplication.class, args);
    }
}
