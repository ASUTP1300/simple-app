package com.home.simpleapp.repository.third;

import com.home.simpleapp.config.SecondConfig;
import com.home.simpleapp.config.ThirdConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;

@ConditionalOnBean(ThirdConfig.class)
@Repository
public class ThirdRepositoryImpl implements ThirdRepository {

    @Autowired
    private ThirdConfig config;

    @PostConstruct
    void checkBean(){
        System.out.printf("\n Hello! I'm living, %s\n", this.getClass());
    }
}
