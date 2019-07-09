package com.mayikt.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//1
@SpringBootApplication
@RestController
public class App {

	@RequestMapping("/")
	public String index() {
		return "大家好  我是渣渣辉...是兄弟就来砍我....";
	}

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}

}
