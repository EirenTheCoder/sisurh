package devida.siurh; // O el paquete principal

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import devida.siurh.controller.HomeController;


@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class SiurhApplication { // o el nombre que le hayas dado

    public static void main(String[] args) {
        SpringApplication.run(HomeController.class, args);
    }
}