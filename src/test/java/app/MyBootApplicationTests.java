package app;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = { MyBootApplication.class }, webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
public class MyBootApplicationTests {

	private static final String API_ROOT = "http://localhost:8081/api/books";

	@Before
	public void setUp() {
	}


	@Test
	public void contextLoads() {
		Assert.assertTrue(true);


	}

}
