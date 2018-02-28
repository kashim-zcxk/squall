package mx.squall;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import java.net.*;

@SpringBootApplication
//@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
@EnableMongoRepositories
public class SquallApplication {

	public static void main(String[] args) {
		SpringApplication.run(SquallApplication.class, args);
	}
}
