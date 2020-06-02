package com.san.jwt.ctrl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/web")
public class WebController {

	@RequestMapping(value="/test",method=RequestMethod.GET)
	public String testMethod(){
		return "test";
		
	}
}
