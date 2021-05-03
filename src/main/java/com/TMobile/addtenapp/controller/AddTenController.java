package com.TMobile.addtenapp.controller;

import com.TMobile.addtenapp.model.SumObject;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddTenController {

    @RequestMapping(path="/{number}")
    public SumObject getAddTen(@PathVariable("number") String num){
        SumObject sum = new SumObject();
        sum.setSum(String.valueOf(Integer.parseInt(num)+10));
        return sum;
    }


}
