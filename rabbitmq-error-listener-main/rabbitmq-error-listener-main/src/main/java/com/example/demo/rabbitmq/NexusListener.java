package com.example.demo.rabbitmq;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class NexusListener {
    @RabbitListener(queues = {"errorQueue"})
    void NucleousError(String application){
        System.out.println("Ocurrio un error al usar la app: " + application);
    }
}
