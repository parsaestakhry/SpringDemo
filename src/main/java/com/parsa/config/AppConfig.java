package com.parsa.config;


import com.parsa.Desktop;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean(name = "aaa")
    public Desktop desktop(){
        return new Desktop();
    }
}
