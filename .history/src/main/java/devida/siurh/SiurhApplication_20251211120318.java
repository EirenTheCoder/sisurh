package devida.siurh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.r2dbc.R2dbcAutoConfiguration; // 👈 NUEVA IMPORTACIÓN
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication(
    exclude = {
        DataSourceAutoConfiguration.class,  // Mantiene la exclusión de JDBC
        R2dbcAutoConfiguration.class        // 👈 ¡AÑADE ESTA EXCLUSIÓN!
    }
)
public class SiurhApplication extends SpringBootServletInitializer { 

    public static void main(String[] args) {
        SpringApplication.run(SiurhApplication.class, args);
    }
    
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(SiurhApplication.class);
    }
}