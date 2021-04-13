package com.theismann.strings;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HomeController {
	@RequestMapping("/")
	public String index(@RequestParam(value="q", required=false) String searchQuery) {
		return "Hello Client! You searched for" + searchQuery;
	
	}
	@RequestMapping("/random")
	public String random() {
		return "Spring Boot is great! So easy to just respond with strings..";
	}
}
