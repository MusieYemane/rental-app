//package com.mosi.rentalsysapp.config;
//
//import org.springframework.security.web.SecurityFilterChain;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.web.SecurityFilterChain;
//import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
//
//@Configuration
//@EnableWebSecurity
//public class SecurityConfig  {
//
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http.authorizeRequests()
//                .antMatchers("/public/**").permitAll() // Allow access to public resources
//                .anyRequest().authenticated()
//                .and()
//                .addFilterBefore(auth0AuthenticationFilter(), UsernamePasswordAuthenticationFilter.class);
//    }
//
//    @Bean
//    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
//        http.csrf().disable()
//                .authorizeRequests(authorizeRequests ->
//                        authorizeRequests.antMatchers("/login/**").permitAll()
//                                .anyRequest().authenticated())
//                .oauth2Login(withDefaults());
//
//        return http.build();
//    }
//
//    @Bean
//    public Auth0AuthenticationFilter auth0AuthenticationFilter() throws Exception {
//        Auth0AuthenticationFilter filter = new Auth0AuthenticationFilter(auth0Config());
//        filter.setAuthenticationManager(authenticationManager());
//        return filter;
//    }
//
//    @Bean
//    public Auth0Config auth0Config() {
//        // Configure Auth0 settings (e.g., clientId, clientSecret, domain)
//        return new Auth0Config();
//    }
//}
