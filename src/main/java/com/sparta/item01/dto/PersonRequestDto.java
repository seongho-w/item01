package com.sparta.item01.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PersonRequestDto {
    String name;
    int age;
    String address;

    public PersonRequestDto(String name, int age, String address){
        this.name = name;
        this.age = age;
        this.address = address;
    }
}

