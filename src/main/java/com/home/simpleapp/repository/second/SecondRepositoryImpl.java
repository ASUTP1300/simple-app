package com.home.simpleapp.repository.second;

import com.home.simpleapp.config.SecondConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;

@ConditionalOnBean(SecondConfig.class)
@Repository
public class SecondRepositoryImpl implements SecondRepository {

    @Autowired
    private SecondConfig config;

    @PostConstruct
    void checkBean(){
        System.out.printf("\n Hello! I'm living, %s\n", this.getClass());
    }
}
