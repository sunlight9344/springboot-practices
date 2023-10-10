package ex01;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

/**
 *  SpringBoot Test Integration 
 *  
 *  Error :
 *  SpringBoot Test Integeration(SpringBootTest) 에서는
 *  @Configuration 을 달고 있는 설정 클래스는 자동으로 스캔 불가능
 *  -->> @SpringBootConfiguration 을 달아줘야 함
 */

@SpringBootTest
// spring boot configuration 달려있는애를 찾음 그래서 그냥 configuration 붙이면 못 찾어
// ㅅ @ExtendWith(SpringExtension.class)
// ㅣ @ContextConfiguration(classes = {MyApplication.class})
public class MyApplicationTest02 {
	
	@Autowired
	private MyComponent myComponent;
	
	@Test
	public void myComponenetNotNull() {
		assertNotNull(myComponent);
	}
}
