package com.example.demo;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;
import java.net.InetAddress;


@RestController
@EnableAutoConfiguration
public class DemoApplication {

	@RequestMapping("/")
	String home() throws Exception {
		
		InetAddress inetAddress = InetAddress.getLocalHost();
		String IP=inetAddress.getHostAddress();
		String HostName=inetAddress.getHostName();
		return "Hello World! from"+" "+IP+" "+HostName;
		
	}
	

	public static void main(String[] args) throws Exception {
		SpringApplication.run(DemoApplication.class, args);
	}

}
