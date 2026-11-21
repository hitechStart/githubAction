package ar.edu.unsam.testingdesoftware.githubaction;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class GithubactionApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void pruebaQueFallaYLuegoSeCorrige(){
		assertEquals(1,1);
	}

}
