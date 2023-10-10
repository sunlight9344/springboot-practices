package com.poscodx.springboot.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 *  1. Bootstraping Class : 스프링 어플리케이션의 부트스트래핑 역할맥
 *  2. Configuration Class 역할도 함
 */
@SpringBootApplication
public class HelloWorldApplication {

	public static void main(String[] args) {
		
		/**
		 *  SpringApplication.run(...) 안에서 일어 나는 1
		 *  
		 *  1. Application Context, Spring Container 생성
		 *  3. If WebApplication, Decide WebApplication Type(Spring MVC, Reactive)
		 *  2. Annotation Scanning(Component Scaning) + Configuration Class 를 통한
		 *     Bean 생성, 등록, 와이어링 작업
		 *  4. 설정 다 해줄려면 HelloWorldApplication 이 존재하는 패키지 하부의 설정 파일들을 다 뒤지는거임
		 *  5. 만약 웹이플리케이션이고 타입이 SpringMVC 이면
		 *     - 내장(embedded) 된 서버(TomcatEmbeddedServiceServletContainer)
		 *     - 서버 인스턴스 웹 에플리케이션 배포(mvc, aop, security, ... Auto Configuration)
		 *     - 서버 인스턴스 Start !!!
		 *  6. ApplicationRunner 인터페이스를 구현한 빈을 Application Context 찾아서 실행      
		 */
		
//		ConfigurableApplicationContext ac = null;
//		
//		try {
//			ac = SpringApplication.run(HelloWorldApplication.class, args);
//		} catch(Throwable ex) {
//			ex.printStackTrace();
//		} finally {
//			if(ac != null) {
//				ac.close();
//			}
//		}
		
		// try ~ with ~ resources 구문
		try(ConfigurableApplicationContext ac= SpringApplication.run(HelloWorldApplication.class, args)){}
	}
	
}
