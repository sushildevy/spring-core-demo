package com.vastika.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("textService")
public class TextService implements MessageService{
    @Value("${user.mobile}")
    private String mobileNo;
    @Override
    public void sendMessage(String msg) {
        System.out.println(msg+", is sent via " +mobileNo);
    }
}
