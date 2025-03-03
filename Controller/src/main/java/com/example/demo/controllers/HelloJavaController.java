package com.example.demo.controllers;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.models.Person;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
//import ch.qos.logback.core.model.Model;
import org.springframework.ui.Model;

@Controller
public class HelloJavaController {
	
	
	@GetMapping("/test1")
	@ResponseBody
	public String SayHello() {
		return "Hello Java MVc again!";
	}

	@GetMapping("/")
	public String HomePage(Model model) {
		model.addAttribute("mesg" ,"Have a good day!");
		return "helloPage";
	}
	
	@GetMapping("/test3")
	public ModelAndView SayHelloAgain() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("mesg","same view another fuctionalities");
		mv.setViewName("helloPage");
		return mv;
		
		
	}
	
	@GetMapping("/test4")
	public String SayHelloAgain2(@RequestParam("message") String message, Model model) {
		model.addAttribute("message", message);
		return "helloPage";
		
		
	}
	
	@GetMapping("/friends")
	public String showFriends(Model model) {
	
		List<Person> friends = new ArrayList<Person>();
		
		friends.add(new Person(1,"Esraa",23));
		friends.add(new Person(2,"Menna",23));
		friends.add(new Person(3,"Heba",23));
		
		System.out.println(friends);
		
		model.addAttribute("ppl", friends);
		
		return "showFriends";
		
	}
	
	@GetMapping("/friendsJSON")
	@ResponseBody
	public List<Person> showFriendsJSON(Model model) {
	
		List<Person> friends = new ArrayList<Person>();
		
		friends.add(new Person(1,"Esraa",23));
		friends.add(new Person(2,"Menna",23));
		friends.add(new Person(3,"Heba",23));
		
		System.out.println(friends);
		
		model.addAttribute("ppl", friends);
		
		return friends;
		
	}
}
