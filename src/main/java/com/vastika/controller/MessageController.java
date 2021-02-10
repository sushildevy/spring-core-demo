package com.vastika.controller;

import com.vastika.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MessageController {

   /* @Autowired
    private MessageService messageService;*/        //------ way to inject

    private final MessageService messageService;
    //@Autowired ------ when we write final, we don,t write @Autowired
    public MessageController(MessageService messageService) {
        this.messageService = messageService;
    }

    public  void Send(){
       messageService.sendMessage("I am good");
   }
}
