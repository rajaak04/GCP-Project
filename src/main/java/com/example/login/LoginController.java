package com.example.login;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/call")
public class LoginController {
@GetMapping("/api")
public String getmethod() {
	return "hi springboot";
}

}
