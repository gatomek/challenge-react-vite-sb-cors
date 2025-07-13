package pl.gatomek.uuid.backendcorsglobal.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GlobalCorsConfig {

    @Bean
    public CorsConfigurer corsConfig() {
        return new CorsConfigurer();
    }
}
