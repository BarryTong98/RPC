package com.mszlu.rpc.consumer.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestConfig {

    //Define RestTemple which provided by spring
    //Initiate the HTTP request, pass the parameters, and parse the return value(Class<T> responseType)
    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }

}
