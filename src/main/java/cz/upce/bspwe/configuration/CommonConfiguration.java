package cz.upce.bspwe.configuration;

import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class CommonConfiguration {

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    @Primary
    public ObjectMapper objectMapper() {
        return Jackson2ObjectMapperBuilder.json()
            .modules(new JavaTimeModule())
            .featuresToDisable(
                DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES,
                SerializationFeature.FAIL_ON_EMPTY_BEANS,
                SerializationFeature.WRITE_DATES_AS_TIMESTAMPS
            )
            .propertyNamingStrategy(PropertyNamingStrategies.LOWER_CAMEL_CASE)
            .build();
    }

}
