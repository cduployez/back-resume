package fr.cduployez.backresume.restcontroller.spring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/example")
public class ExampleRestController {

    @GetMapping("/hello")
    public String helloWorld() {
        return "Hello world";
    }

}
