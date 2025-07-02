package com.example.task1.task1;

import org.springframework.stereotype.Component;

@Component
public class MessagePrinter {
    private final HelloMessageService helloMessageService;

    MessagePrinter(HelloMessageService helloMessageService){
        this.helloMessageService = helloMessageService;
    }

    void print(){
        helloMessageService.printHello();;
    }


}
