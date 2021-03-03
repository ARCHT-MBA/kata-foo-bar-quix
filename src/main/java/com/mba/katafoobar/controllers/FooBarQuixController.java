package com.mba.katafoobar.controllers;

import com.mba.katafoobar.model.ResultDto;
import com.mba.katafoobar.service.FooBarQuixService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api
@RequestMapping("/foo-bar-quix")
public class FooBarQuixController {

    @Autowired
    FooBarQuixService fooBarQuixService;

    @GetMapping( "/{inputNumber}")
    public ResultDto convertNumber(@PathVariable(name = "inputNumber")String inputNumber){
        return new ResultDto(fooBarQuixService.numberToString(inputNumber));
    }

}
