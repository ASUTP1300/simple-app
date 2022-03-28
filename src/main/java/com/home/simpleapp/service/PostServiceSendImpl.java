package com.home.simpleapp.service;

import com.home.simpleapp.service.send.SendService;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@ConditionalOnBean(SendService.class)
@Service
public class PostServiceSendImpl {

    private SendService sendService;

    @PostConstruct
    void checkBean(){
        System.out.printf("\n Hello! I'm living, %s\n", this.getClass());
    }
}
