package com.doney.advanced;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AdvancedApplication {

	public static void main(String[] args) {
		SpringApplication.run(AdvancedApplication.class, args);
	}

	@GetMapping("test")
	public Object get() throws Exception {
		throw  new Exception("测试全局异常！");
	}
	public void test(){
		System.out.println("hello");
	}
}
