package ex04;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @SpringBootApplication 메타 어노테이션
 * 
 *   + @SpringBootConfiguration: cf) ex01, ex02
 *   + @ComponentScan: ex04, 하부 패키지를 스캔 한다. cf)ex03
 *   + @EnableAutoConfiguration <-- 진짜 끝내주는 놈
 *     1. MVC, AOP, Security, JPA 등을 자동으로 설정한다.
 *     2. 발견된 Starter Dependency(Library) 기반으로 설정 (Default 설정으로 해놓음)
 *     3. + application.properties 또는 application.yml 안의 미세 설정 (필수)
 * 	
 * 
 */

@SpringBootApplication
public class MyApplication {
	public static void main(String[] args) {
		try(ConfigurableApplicationContext ac= SpringApplication.run(MyApplication.class, args)){}
	}
}
