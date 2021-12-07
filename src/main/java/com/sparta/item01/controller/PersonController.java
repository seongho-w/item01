package com.sparta.item01.controller;

import com.sparta.item01.dto.PersonRequestDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

    @GetMapping("/myinfo")
    public PersonRequestDto getPerson() {
        PersonRequestDto dto = new PersonRequestDto("손흥민",22,"영국");


        return dto;

    }
}
