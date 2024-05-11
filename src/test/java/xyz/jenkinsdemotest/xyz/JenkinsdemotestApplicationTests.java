package xyz.jenkinsdemotest.xyz;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

class JenkinsdemotestApplicationTests {

	@Test
	void contextLoads() {
        int resultado = 3+5;
        assertEquals(8, resultado, "La suma no es correcta");

	}

	@Test
	void context2() {
        int resultado = 3+5;
        assertEquals(8, resultado, "La suma no es correcta");
	}
}
