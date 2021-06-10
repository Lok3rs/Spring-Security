package com.codecool.springsecurity.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.thymeleaf.spring5.view.ThymeleafViewResolver;
import org.thymeleaf.spring5.webflow.view.AjaxThymeleafViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.codecool.springsecurity")
public class SpringSecurityAppConfig {

    // define a bean for ViewResolver

    @Bean
    public ThymeleafViewResolver viewResolver() {
        String[] excludedViews = new String[]{
                "login", "logout"};
        ThymeleafViewResolver viewResolver = new AjaxThymeleafViewResolver();
        viewResolver.setExcludedViewNames(excludedViews);
        return viewResolver;
    }
}
