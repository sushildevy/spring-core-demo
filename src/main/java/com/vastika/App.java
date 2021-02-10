package com.vastika;

import com.vastika.configuration.SpringConfiguration;
import com.vastika.controller.HelloController;
import com.vastika.controller.MessageController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context=new AnnotationConfigApplicationContext(SpringConfiguration.class);
        MessageController messageController=context.getBean(MessageController.class);
        messageController.Send();
        System.out.println("========================");
        HelloController helloController=context.getBean(HelloController.class);
        helloController.sayHello();
    }
}
