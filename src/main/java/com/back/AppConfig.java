package com.back;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

//    @Bean
//    public PersonService personServiceV2() {
//        System.out.println("personService V2 빈 생성");
//        return new PersonService(2);
//    }
//    @Bean
//    public PersonService personServiceV3() {
//        System.out.println("personService V3 빈 생성");
//        return new PersonService(3);
//    }

    @Bean
    public int personVersion () {
        return 2;
    }

}
