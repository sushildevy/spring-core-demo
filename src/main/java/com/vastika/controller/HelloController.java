package com.vastika.controller;

import com.vastika.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class HelloController {

   /* @Autowired
    @Qualifier("textService")*/
    private MessageService messageService;

    //Constructor based
    public  HelloController(@Qualifier("textService")MessageService messageService){
        this.messageService=messageService;
    }

    public void sayHello(){
        messageService.sendMessage("Hello");

    }
}
