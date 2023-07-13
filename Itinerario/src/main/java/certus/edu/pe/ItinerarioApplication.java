package certus.edu.pe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ItinerarioApplication {

	public static void main(String[] args) {
		SpringApplication.run(ItinerarioApplication.class, args);
	}

}
