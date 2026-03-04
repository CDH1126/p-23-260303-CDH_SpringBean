package com.back;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.annotation.Order;
import org.springframework.transaction.annotation.Transactional;

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
    @Order(1)
    public ApplicationRunner myApplicationRunner1() {
        return args -> { // 익명 객체 간소화 버전
            System.out.println("MyApplicationRunner1 is running");
        };
    }

    @Bean
    @Order(2)
    public ApplicationRunner myApplicationRunner2() {
        return args -> { // 익명 객체 간소화 버전
            System.out.println("MyApplicationRunner2 is running");
        };
    }

    @Autowired
    @Lazy
    private AppConfig self; // AppConfigProxy의 리모콘


    @Bean
    public ApplicationRunner myApplicationRunner3() {
        return args -> { // 익명 객체 간소화 버전
            work1();
            work2();
        };
    }

    @Transactional
    public void work1() {
        System.out.println("work1 is running");
    }

    @Transactional
    public void work2() {
        System.out.println("work2 is running");
    }

}
