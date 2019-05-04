package cn.hcx.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 以接口对外暴露，从而封装底层操作
 * 这个接口相当于把原来的服务提供者项目当成一个Service类
 * @author asus
 *
 */
@FeignClient(value="provider-user")	// 跟提供者关联
public interface EurekaServiceFeign {
	
	/*
	 * Feign中没有原生的@GetMapping/@PostMapping/@DeleteMapping/@PutMapping，要指定需要用method进行
	 */
	@RequestMapping("/hello/{name}")
	// 请求变量名称需要写全
	public String hello(@PathVariable("name") String name);

}
