package fr.cduployez.backresume.config.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.Clock;
import java.time.ZoneId;

@Configuration
public class DateConfig {

    @Bean
    public Clock clock() {
        return Clock.system(ZoneId.systemDefault());
    }

}
