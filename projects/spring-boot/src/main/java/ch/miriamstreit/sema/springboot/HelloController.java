package ch.miriamstreit.sema.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Demo class for handling HTTP requests.
 */
@RestController
public class HelloController {
    /**
     * Function for anonymous greeting.
     * @return greeting message
     */
    @GetMapping("/hello")
    public String greet() {
        return "Hello, stranger!";
    }
    /**
     * Function for personalized greeting.
     * @param name the name to greet
     * @return greeting message
     */
    @GetMapping("/hello/{name}")
    public String greetWithName(@PathVariable("name") final String name) {
        return "Hello, " + name + "!";
    }
}
