package com.home.simpleapp.service.send;

import com.home.simpleapp.repository.first.FirstRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;


@ConditionalOnBean(FirstRepository.class)
@Service
public class SendServiceFirstImpl implements SendService{

    @Autowired
    private FirstRepository repository;

    @PostConstruct
    void checkBean(){
        System.out.printf("\n Hello! I'm living, %s\n", this.getClass());
    }
}
