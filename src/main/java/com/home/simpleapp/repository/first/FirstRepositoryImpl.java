package com.home.simpleapp.repository.first;

import com.home.simpleapp.config.FirstConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;

@ConditionalOnBean(FirstConfig.class)
@Repository
public class FirstRepositoryImpl implements FirstRepository {

    @Autowired
    private FirstConfig config;

    @PostConstruct
    void checkBean(){
        System.out.printf("\n Hello! I'm living, %s\n", this.getClass());
    }
}
