package pe.edu.upc.rendimacadem.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test")
public class TestController {

    @GetMapping("saludar")
    public String saludar(){
        return "Hola Mundo 2!";
    }
}
