 package com.example.demo.config;
 import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

 @Configuration
 @EnableWebSecurity
 public class WebConfig extends WebSecurityConfigurerAdapter {

     @Override
     public void configure(WebSecurity web) throws Exception {
         web.ignoring().antMatchers("/resources/**");
     }

     @Override
     protected void configure(HttpSecurity http) throws Exception {
         http.authorizeRequests().antMatchers("/").permitAll().antMatchers("/home")
             .hasAnyRole("USER", "ADMIN").antMatchers("/getStudent").hasAnyRole("USER", "ADMIN")
             .antMatchers("/addStudent").hasAnyRole("ADMIN").anyRequest().authenticated().and().formLogin().defaultSuccessUrl("/home")
             .permitAll().and().logout().permitAll();

         http.csrf().disable();
     }

     @Autowired
     public void configureGlobal(AuthenticationManagerBuilder authenticationMgr) throws Exception {
         authenticationMgr.inMemoryAuthentication().withUser("employee").password("{noop}employee")
             .authorities("ROLE_USER").and().withUser("admin").password("{noop}admin")
             .authorities("ROLE_USER", "ROLE_ADMIN");
     }
 }