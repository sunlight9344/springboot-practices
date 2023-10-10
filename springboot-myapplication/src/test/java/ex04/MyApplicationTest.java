package ex04;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import ex04.component.MyComponent;

/**
 *  SpringBoot Test Integration 
 *  
 *  Error :
 *  SpringBoot Test Integeration(SpringBootTest) 에서는
 *  @Configuration 을 달고 있는 설정 클래스는 자동으로 스캔 불가능
 *  -->> @SpringBootConfiguration 을 달아줘야 함
 */

@SpringBootTest
public class MyApplicationTest {
	
	@Autowired
	private MyComponent myComponent;
	
	@Test
	public void myComponenetNotNull() {
		assertNotNull(myComponent);
	}
}
