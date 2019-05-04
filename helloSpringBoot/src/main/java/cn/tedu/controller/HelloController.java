package cn.tedu.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 业务需求
 * 访问controller/hello路径，页面打印Json返回值
 * @author asus
 *
 */
@RequestMapping("/")
@RestController // 相当于@Controller + @ResponseBody
public class HelloController {
	
	public HelloController() {
		System.out.println("HelloController()");
	}

	@RequestMapping("hello/{name}")
	public String hello(@PathVariable String name) {// @PathVariable可以用来映射URL中的占位符到目标方法的参数中
		return "springboot hello:" + name;
	}
}
