package hacks;

import hacks.window.MainView;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "hacks")
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);


	}

}
