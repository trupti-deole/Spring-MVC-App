package com.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Welcomecontroller {
	//we have to convert it into HttpRequestHandlerMethod
	@RequestMapping(value="/welcome")  //return model & view
     public String welcomePage()
     {
    	 return "welcome"; //view file name
     }
}
