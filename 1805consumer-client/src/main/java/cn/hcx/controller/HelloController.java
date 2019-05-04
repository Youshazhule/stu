package cn.hcx.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HelloController {

	// 需要一个模版对象
	@Autowired
	private RestTemplate restTemplate;
	
	@RequestMapping("/hello/{name}")
	public String hello(@PathVariable String name) {
		// 调用服务提供者
		String url = "http://localhost:7900/hello/" + name; 
		// 使用eureka动态列表通过application.name找到真正提供者地址
		url = "http://provider-user/hello/" + name;
		// 访问提供者
		return restTemplate.getForObject(url, String.class);
	}
}
