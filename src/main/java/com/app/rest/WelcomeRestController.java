package com.app.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.client.WelcomeClient;

@RestController
@RequestMapping("/wel")
public class WelcomeRestController {
	
	//zipkincode
	
	private static final Logger log = LoggerFactory.getLogger(WelcomeRestController.class);//used tommcreate log that will check this service how many stages passed
	//and for that it sues two instance span id ()service id
//and token id.
	
	//feign client code
  @Autowired
  private WelcomeClient welclient;
	@GetMapping("/welcome/{name}")
	public String ShowWelcome(@PathVariable("name") String str) {
		log.info("ShowWelcome() message is started!");
		String name=welclient.showMsg(str);//through path variable we are getting the name here.
		log.info("ShowWelcome() message is started!");
		return name;//o/p->hello name
		
	}
}
