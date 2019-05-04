package cn.hcx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * 消费者
 * @author asus
 *
 */
@SpringBootApplication
@EnableEurekaClient	// Eureka客户端
public class ConsumerRunApp {

	
	@Bean			// 初始化模版对象
	@LoadBalanced	// 实现负载均衡
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
	
	public static void main(String[] args) {
		SpringApplication.run(ConsumerRunApp.class, args);
	}
	
}
