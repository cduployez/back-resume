package fr.cduployez.backresume.config.spring;

import fr.cduployez.backresume.config.filters.CorsFilter;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.access.channel.ChannelProcessingFilter;

import java.util.List;

@Configuration
@NoArgsConstructor
@Slf4j
public class SecurityConfig {

    /**
     * Allowed URLs for CORS
     */
    @Value("${cors.allowed-urls}")
    private List<String> allowedCorsUrls;

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        return http.addFilterBefore(new CorsFilter(allowedCorsUrls), ChannelProcessingFilter.class).build();
    }

}
