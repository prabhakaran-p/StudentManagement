package com.prabhu.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/")
public class HomePageController {
	
	@GetMapping
	public String home(){
        return "Welcome login sucess";
    }
}
