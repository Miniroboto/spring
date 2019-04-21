package com.sda.first_project.production;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WorkerConfig {

    @Bean
    public WorkerMotto workerMotto(){
        return new WorkerMotto("Ai n-ai mingea, dai la poarta");
    }

}
