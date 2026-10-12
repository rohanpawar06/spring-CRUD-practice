package in.rohan.crudSpringBootdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.jdbc.autoconfigure.DataSourceAutoConfiguration;

@SpringBootApplication(exclude ={DataSourceAutoConfiguration.class })
public class CrudSpringBootdemoApplication {

	public static void main(String[] args) {
        SpringApplication.run(CrudSpringBootdemoApplication.class, args);

        System.out.println("Hello World");

	}
}
