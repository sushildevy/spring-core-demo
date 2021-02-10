package com.vastika.configuration;

import com.vastika.controller.MessageController;
import com.vastika.service.EmailService;
import com.vastika.service.MessageService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(value ="com.vastika")
@PropertySource(value="classpath:message.properties")
public class SpringConfiguration {
/*    @Bean
    public MessageController messageController(){
        return new MessageController();
    }*/

/*    @Bean
   public MessageService messageService(){
        return new EmailService() {
        };
    }*/
}
