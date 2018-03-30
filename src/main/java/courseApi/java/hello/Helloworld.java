package courseApi.java.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Helloworld {

	@RequestMapping("/hello")
	public String greet() {
		return "Hello World!!";
	}
}
