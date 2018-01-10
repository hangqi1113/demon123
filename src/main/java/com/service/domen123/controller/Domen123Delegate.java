package com.service.domen123.controller;

import org.springframework.stereotype.Component;


@Component
public class Domen123Delegate implements Domen123 {

    public String helloworld(String name){

        // Do Some Magic Here!
        return name;
    }
}
