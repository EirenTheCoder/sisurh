package devida.siurh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/siurh")
    public String home() {
        return "/home"; // Retorna la vista llamada "home"
    }
}
