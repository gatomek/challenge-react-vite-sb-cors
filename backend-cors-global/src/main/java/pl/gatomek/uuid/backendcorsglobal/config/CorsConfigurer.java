package pl.gatomek.uuid.backendcorsglobal.config;

import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

public class CorsConfigurer implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry corsRegistry) {
        corsRegistry.addMapping("/api/uuid")
                .allowedOrigins("http://localhost:5174")
                .allowedMethods( "GET", "POST")
                .maxAge( 1);
    }
}
