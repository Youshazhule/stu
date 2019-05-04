package cn.tedu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 放在所有需要处理类等文件的父目录
 * @author asus
 *
 */
@SpringBootApplication // 2
public class RunApp {

	/**
	 * main函数作为入口函数
	 * 内置tomcat 启动直接访问根目录即可
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(RunApp.class, args);// 1
	}
}
