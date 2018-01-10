package com.service.domen123.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestDomen123 {

    Domen123Delegate domen123Delegate = new Domen123Delegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = domen123Delegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}
