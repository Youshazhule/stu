package cn.hcx.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import cn.hcx.feign.EurekaServiceFeign;

@RestController
public class HelloController {

	// 调用feign接口
	@Autowired
	private EurekaServiceFeign eurekaServiceFeign;
	
	@RequestMapping("/hello/{name}")
	public String hello(@PathVariable String name) {
		// 访问服务提供者
		return eurekaServiceFeign.hello(name);
	}
	
}
