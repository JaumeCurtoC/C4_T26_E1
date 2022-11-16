package com.example.C4_T26;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@Configuration
@EnableWebSecurity
public class WebSecurityConfig implements WebMvcConfigurer{
	
	@Bean
	protected SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
    	http
    	.csrf().disable()
    	.authorizeRequests()
    	.antMatchers(HttpMethod.OPTIONS, "/**").authenticated()
        .antMatchers(HttpMethod.GET,"/**").authenticated()
        .antMatchers(HttpMethod.POST,"/**").authenticated()
        .antMatchers(HttpMethod.PUT, "/**").authenticated()
        .antMatchers(HttpMethod.DELETE,"/**").hasRole("admin")
        .anyRequest().authenticated()
        .and().formLogin().permitAll()
        .and().httpBasic();
    	
    	return http.build();
    }
    
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**").allowedMethods("*");
    }

}
