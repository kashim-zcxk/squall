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
		/*System.getProperties().put("http.proxyHost", "10.50.8.21");
		System.getProperties().put("http.proxyPort", "8080");
		System.getProperties().put("https.proxyHost", "10.50.8.21");
		System.getProperties().put("https.proxyPort", "8080");
		System.getProperties().put("http.nonProxyHosts", "127.0.0.1");

		System.getProperties().put("java.net.useSystemProxies", "true");
		System.out.println(">> " + System.getProperties());
	      try{
	    	  	URL url = new URL("https://www.google.com");
	            InetAddress address = InetAddress.getByName(url.getHost());
	            boolean reachable = address.isReachable(10000);

	            System.out.println("Is host reachable? " + reachable);
	        } catch (Exception e){
	            e.printStackTrace();
	        }*/
		
		SpringApplication.run(SquallApplication.class, args);
	}
}
