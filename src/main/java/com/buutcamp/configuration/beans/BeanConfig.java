package com.buutcamp.configuration.beans;

import com.buutcamp.objects.SimpleUser;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.web.context.WebApplicationContext;

import java.util.Random;

@Configuration
public class BeanConfig {

    @Bean("sessionUser")
    @Scope(value = WebApplicationContext.SCOPE_SESSION,
        proxyMode = ScopedProxyMode.TARGET_CLASS)
    public SimpleUser getSimpleUserSession() {
        SimpleUser simpleUser = new SimpleUser();
        simpleUser.setAge((new Random()).nextInt(101));

        return simpleUser;
    }

    @Bean("requestUser")
    @Scope(value = WebApplicationContext.SCOPE_REQUEST,
            proxyMode = ScopedProxyMode.TARGET_CLASS)
    public SimpleUser getSimpleUserRequest() {
        SimpleUser simpleUser = new SimpleUser();
        simpleUser.setAge((new Random()).nextInt(101));

        return simpleUser;
    }
}
