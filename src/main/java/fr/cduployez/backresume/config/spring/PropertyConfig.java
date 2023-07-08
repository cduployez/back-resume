package fr.cduployez.backresume.config.spring;

import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.ConversionService;
import org.springframework.core.convert.support.DefaultConversionService;

@Configuration
@NoArgsConstructor
public class PropertyConfig {

    /**
     * PAdd support to convert String to Collection types in properties
     *
     * @return Conversion service
     */
    @Bean
    public ConversionService conversionService() {
        return new DefaultConversionService();
    }

}
