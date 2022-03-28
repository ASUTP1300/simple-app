package com.home.simpleapp.service;

import com.home.simpleapp.service.expresssend.ExpressSendService;
import com.home.simpleapp.service.send.SendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@ConditionalOnBean(ExpressSendService.class)
@Service
public class PostServiceExpressImpl implements PostService {

    @Autowired
    private ExpressSendService service;

    @PostConstruct
    void checkBean(){
        System.out.printf("\n Hello! I'm living, %s\n", this.getClass());
    }
}
