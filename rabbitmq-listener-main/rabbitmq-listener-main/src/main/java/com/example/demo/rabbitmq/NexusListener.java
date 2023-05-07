package com.example.demo.rabbitmq;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class NexusListener {
    @RabbitListener(queues = {"appQueue"})
    void Nucleous(String application){
        System.out.println("Procesando la instruccion recibida de la app: " + application);
    }
}
