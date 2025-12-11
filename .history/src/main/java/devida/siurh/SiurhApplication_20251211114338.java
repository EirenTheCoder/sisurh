package devida.siurh; // O el paquete principal

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import devida.siurh.controller.HomeController;

@SpringBootApplication
public class SiurhApplication { // o el nombre que le hayas dado

    public static void main(String[] args) {
        SpringApplication.run(HomeController.class, args);
    }
}