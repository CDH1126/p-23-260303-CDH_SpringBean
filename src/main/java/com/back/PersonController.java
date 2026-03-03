package com.back;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequiredArgsConstructor
public class PersonController {

    // new 를 사용할 경우 Spring Boot가 관리하지 않는다
    private final PersonService personService;


    @GetMapping("/people")
    @ResponseBody
    public String people() {

        return "사람 수 : %d".formatted(personService.count());
    }
}