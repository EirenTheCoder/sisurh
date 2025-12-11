// Archivo: SiurhApplication.java

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer; // 👈 IMPORTACIÓN

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
// 👈 EXTENDER ESTO ES VITAL para el modo WAR
public class SiurhApplication extends SpringBootServletInitializer { 

    public static void main(String[] args) {
        SpringApplication.run(SiurhApplication.class, args);
    }
    
    // 💡 Método necesario para que el contenedor externo encuentre la configuración
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(SiurhApplication.class);
    }
}