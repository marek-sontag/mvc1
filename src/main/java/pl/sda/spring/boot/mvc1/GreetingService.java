package pl.sda.spring.boot.mvc1;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {

    public String greeting() {
        return "Greeting from service!";
    }
}
