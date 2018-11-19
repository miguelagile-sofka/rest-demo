package co.com.sofka.demospringrest.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class DemoController {

    @GetMapping("/mensaje")
    public  String getMensaje () {
        return "Hola Mundo sin BD";
    }
    
}