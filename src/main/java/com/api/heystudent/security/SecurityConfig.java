package com.api.heystudent.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

       @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
            .csrf(csrf -> csrf.disable()) // Disable CSRF for testing (enable it later if needed)
            .authorizeHttpRequests(auth -> auth
                .requestMatchers("/**").permitAll() // Allow public endpoints
                .anyRequest().authenticated() // Secure all other endpoints
            )
            .formLogin(form -> form.disable()) // Disable form login
            .httpBasic(httpBasic -> httpBasic.disable()); // Disable basic auth (if not needed)
        return http.build();
    }

}
