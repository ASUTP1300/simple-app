package com.home.simpleapp.service.expresssend;

import com.home.simpleapp.repository.third.ThirdRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@ConditionalOnBean(ThirdRepository.class)
@Service
public class ExpressSendServiceThirdImpl implements ExpressSendService {

    @Autowired
    private ThirdRepository repository;

    @PostConstruct
    void checkBean(){
        System.out.printf("Я живой, %s", this.getClass());
    }
}
