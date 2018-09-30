package com.example;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication//等于@EnableAutoConfiguration+@ComponentScan=SpringBootApplication扫描同级包和当前包(包含子包),缺点:递归所有包浪费启动时间
//@EnableAutoConfiguration//自动配置,默认扫当前类
//@ComponentScan(basePackages = {"com.example.controller", "com.example.service","com.example.dao"})//扫描包,缺点:如果包比较多,写起来麻烦;优点:扫描指定包节约启动时间
//@MapperScan(basePackages = {"com.example.mapper"})//扫描mapper包,sql写在Java文件李
@MapperScan(basePackages = {"com.example.dao","com.example.dao.impl"})//扫描mapper包,sql写在xml里
@EnableTransactionManagement
public class Application {
	//整个程序入口,启动springBoot项目创建内置tomcat服务器,使用tomcat加载springmvc,注解启动
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
//整合过程中遇到@SpringBootApplication启动报错,可能是包冲突问题
