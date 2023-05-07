package com.example.demo.rabbitmq;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class NexusListener {
    @RabbitListener(queues = {"confirmationQueue"})
    void NucleousConfirmation(String application){
        System.out.println("Todas las requests de la app han sido completadas, detalles: " + application);
    }
}
