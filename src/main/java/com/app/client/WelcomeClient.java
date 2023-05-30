package com.app.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="message-app")
public interface WelcomeClient {
	@GetMapping("/sms/msg/{name}")
	public String showMsg(@PathVariable("name") String str); 
		
	

}
