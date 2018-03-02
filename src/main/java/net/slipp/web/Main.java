package net.slipp.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Main {
	@GetMapping("/")
	public String main() {
		System.out.println("Main page is comming!");
		return "index";
	}
}
