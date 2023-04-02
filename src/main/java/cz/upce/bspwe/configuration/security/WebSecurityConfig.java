package cz.upce.bspwe.configuration.security;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.csrf.HttpSessionCsrfTokenRepository;

@EnableWebSecurity
public class WebSecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http.authorizeRequests(
                authorize -> authorize.antMatchers("/auth/sign-up", "/auth/sign-in")
                                      .permitAll()
                                      .anyRequest()
                                      .authenticated()
        );

        http.logout().permitAll();

        http.csrf()
            .csrfTokenRepository(new HttpSessionCsrfTokenRepository())
            .disable();

        return http.build();
    }
}
