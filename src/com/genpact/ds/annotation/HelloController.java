package com.genpact.ds.annotation;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/greet")
public class HelloController {
	
	@RequestMapping("/welcomeAnnotation")
	public ModelAndView testHelloWorld(){
		ModelAndView modelAndView=new ModelAndView("HelloPage");
		modelAndView.addObject("welComeMessage","Hello Guys, How are you??");
		return modelAndView;
	}
	
	
	@RequestMapping("/welcome")
	public ModelAndView helloWorld(){
		ModelAndView modelAndView=new ModelAndView("HelloPage");
		modelAndView.addObject("welComeMessage","Data Services");
		return modelAndView;
	}
	
	/*@RequestMapping("/countryName/{userName}")
	public ModelAndView userNameTest(){
		ModelAndView modelAndView=new ModelAndView("HelloPage");
		modelAndView.addObject("welComeMessage","Hello Guys, Username test program is running");
		return modelAndView;
	}
*/
	
	/*@RequestMapping("/countryName/{userName}")
	public ModelAndView pathVariabeTest(@PathVariable("userName") String name){
		ModelAndView modelAndView=new ModelAndView("HelloPage");
		modelAndView.addObject("welComeMessage","Hello "+name+" , Username test program is running");
		return modelAndView;
	}*/
	
	
	/*@RequestMapping("/{countryName}/{userName}")
	public ModelAndView countryNameTest(@PathVariable("userName") String name,@PathVariable("countryName") String country){
		ModelAndView modelAndView=new ModelAndView("HelloPage");
		modelAndView.addObject("welComeMessage","Hello "+name+" , You are from "+country);
		return modelAndView;
	}*/
	
	@RequestMapping(value="/{countryName}/{userName}",method=RequestMethod.GET)
	public ModelAndView singlePathVariabeTest(@PathVariable Map<String,String> pathVars){
		
		String name=pathVars.get("userName");
		String country=pathVars.get("countryName");
		ModelAndView modelAndView=new ModelAndView("HelloPage");
		modelAndView.addObject("welComeMessage","Hello "+name+" , You are from "+country);
		return modelAndView;
	}
}
