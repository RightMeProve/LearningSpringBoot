package com.example.task5.task5.manager;

import com.example.task5.task5.shape.Shape;

public class ShapeManager {
    private final Shape shape;

    public ShapeManager(Shape shape){
        this.shape = shape;
    }

    public void render(){
        System.out.println("ShapeManager says: ");
        shape.draw();
    }
}
