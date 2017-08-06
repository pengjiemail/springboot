package com.pj.springbootweb;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by 彭杰 on 2017/8/6 <br>
 */
@Controller
@EnableAutoConfiguration
public class HelloWorldController {

	@RequestMapping("/helloworld")
	@ResponseBody
	public String helloworld(){
		return "Hello World !";
	}
}
