package com.example.task5.task5.config;

import com.example.task5.task5.manager.ShapeManager;
import com.example.task5.task5.shape.Circle;
import com.example.task5.task5.shape.Shape;
import com.example.task5.task5.shape.Square;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ShapeConfig {

    @Bean
    public Shape shape(){
        return new Circle();
        // we can return new square() also.
    }

    @Bean
    public ShapeManager shapeManager(){
        return new ShapeManager(shape());
    }
}
