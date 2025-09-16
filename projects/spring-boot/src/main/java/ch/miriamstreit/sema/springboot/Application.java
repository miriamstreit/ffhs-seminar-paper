package ch.miriamstreit.sema.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/**
 * Main Spring Boot class.
 */
@SpringBootApplication
public class Application {
    /**
     * Main Spring Boot function.
     * @param args command line arguments
     */
    @SuppressWarnings("checkstyle:hideutilityclassconstructor")
    public static void main(final String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
