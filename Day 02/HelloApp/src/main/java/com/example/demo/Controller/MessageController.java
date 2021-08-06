package com.example.demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Message;

@RestController

public class MessageController {
	
	@GetMapping("/msg")
	public Message getMessage() {
		return new Message(1, "Hello SpringBoot !");
	}
	
	@GetMapping("/msg/{m}")
	public Message myMessage(@PathVariable("m") String message) {
		return new Message(1, message);
	}
	
	@GetMapping("/sum/{n1}/{n2}")
	public double  sum(@PathVariable("n1") double num1,@PathVariable("n2") double num2){
		return num1+num2;
	}
	
	@GetMapping("/sub")
	public  double sub(@RequestParam(value="n1",defaultValue = "0") double num1,@RequestParam(value="n2",defaultValue = "0") double num2){
		return num1-num2;
	}
}

