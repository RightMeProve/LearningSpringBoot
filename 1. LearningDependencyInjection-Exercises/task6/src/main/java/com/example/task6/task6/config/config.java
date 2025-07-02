package com.example.task6.task6.config;

import com.example.task6.task6.colors.Color;
import com.example.task6.task6.colors.Red;
import com.example.task6.task6.painters.Painter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class config {

    @Bean
    public Color color(){
        return new Red();
    }

    @Bean
    public Painter painter(){
        return new Painter(color());
    }
}
