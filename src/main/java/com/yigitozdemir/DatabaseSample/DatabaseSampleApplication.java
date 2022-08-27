package com.yigitozdemir.DatabaseSample;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.yigitozdemir.DatabaseSample.model.User;
import com.yigitozdemir.DatabaseSample.model.repository.UserRepository;

@SpringBootApplication
public class DatabaseSampleApplication {
	private static final Logger log = LoggerFactory.getLogger(DatabaseSampleApplication.class);
	
	//docker run --name mariadbtest -e MYSQL_ROOT_PASSWORD=passw0rd -p 3306:3306 -d mariadb:latest
	public static void main(String[] args) {
		SpringApplication.run(DatabaseSampleApplication.class, args);
	}
	
	/*@Bean
	public CommandLineRunner demo(UserRepository repository) {
		return (args) -> {
			repository.save(new User("yozdemir", "yigit", "ozdemir", "password"));
			repository.save(new User("fozdemir", "firuze", "ozdemir", "password"));
			repository.save(new User("ocevik", "ozan", "cevik", "password"));
			repository.save(new User("ncevik", "nurgul", "cevik", "password"));
			
			log.info("Saved users");
			log.info("get all users");
			log.info("---------------------");
			for(User user: repository.findAll()) {
				log.info(user.toString());
			}
			
			log.info("Find by user id");
			User user = repository.findById(1);
			log.info(user.toString());
		};
	}*/

}
/*# ===============================
# = DATA SOURCE
# ===============================
# Set here configurations for the database connection
spring.datasource.url=jdbc:mariadb://localhost:3306/springboot_mariadb
spring.datasource.username=root
spring.datasource.password=root
spring.datasource.driver-class-name=org.mariadb.jdbc.Driver
# Keep the connection alive if idle for a long time (needed in production)
spring.datasource.testWhileIdle=true
spring.datasource.validationQuery=SELECT 1
# ===============================
# = JPA / HIBERNATE
# ===============================
# Show or not log for each sql query
spring.jpa.show-sql=true
# Hibernate ddl auto (create, create-drop, update): with "create-drop" the database
# schema will be automatically created afresh for every start of application
spring.jpa.hibernate.ddl-auto=create-drop
# Naming strategy
spring.jpa.hibernate.naming.implicit-strategy=org.hibernate.boot.model.naming.ImplicitNamingStrategyLegacyHbmImpl
spring.jpa.hibernate.naming.physical-strategy=org.springframework.boot.orm.jpa.hibernate.SpringPhysicalNamingStrategy
# Allows Hibernate to generate SQL optimized for a particular DBMS
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL5InnoDBDialect*/