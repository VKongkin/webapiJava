package kongkin.bbu.edu.webapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class WebApiApplication {
	@GetMapping("")
	public String greeting(){
		return "Welcome to web api";
	}

	public static void main(String[] args) {
		SpringApplication.run(WebApiApplication.class, args);
	}

}
