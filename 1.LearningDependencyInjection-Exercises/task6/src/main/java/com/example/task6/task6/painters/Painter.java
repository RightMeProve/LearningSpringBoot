package com.example.task6.task6.painters;

import com.example.task6.task6.colors.Color;

public class Painter {
    private final Color color;

    public Painter(Color color){
        this.color =color;
    }

    public void work(){
        System.out.println("Painter is ");
        color.paint();
    }
}
