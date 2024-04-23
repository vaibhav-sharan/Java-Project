import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
public class JavaProjectApplication {

	public static void main(String[] args) throws IOException {
		SpringApplication.run(JavaProjectApplication.class, args);
		System.out.println("Hello");

	}

}
