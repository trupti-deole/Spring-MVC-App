package com.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GreetController {
	@RequestMapping(value="/greet")  //return model & view
    public String greetPage()
    {
   	 return "greet"; //view file name
    }

}
