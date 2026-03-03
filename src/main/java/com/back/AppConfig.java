package com.back;

import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

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
    public int personVersion() {
        return 2;
    }

    @Bean // Component로 불가능한 Bean 등록의 예시
    public List<Integer> numbers() {
        return List.of(1, 2, 3);
    }

//    @Bean
//    public ApplicationRunner myApplicationRunner() {
//        return new MyApplicationRunner();
//    }

    @Bean
    public ApplicationRunner myApplicationRunner() {
        return args -> { // 익명 객체 간소화 버전
            System.out.println("MyApplicationRunner is running");
        };
    }

}
