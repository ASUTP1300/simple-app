package com.home.simpleapp.service.expresssend;

import com.home.simpleapp.repository.second.SecondRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@ConditionalOnBean(SecondRepository.class)
@Service
public class ExpressSendServiceSecondImpl implements ExpressSendService {

    @Autowired
    private SecondRepository repository;

    @PostConstruct
    void checkBean(){
        System.out.printf("Я живой, %s", this.getClass());
    }
}
