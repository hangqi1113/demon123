package com.service.domen123.controller;


import org.springframework.beans.factory.annotation.Autowired;
import io.servicecomb.provider.pojo.RpcSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CsePojoDemoCodegen", date = "2018-01-10T06:31:13.327Z")

@RpcSchema(schemaId = "domen123")
public class Domen123Impl implements Domen123{

    @Autowired
    private Domen123Delegate domen123Delegate;


    public String helloworld(String name) {

        return domen123Delegate.helloworld(name);
    }

}
