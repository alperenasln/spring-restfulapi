package user;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
//-----------------------------------------------------
//Title: LoadDatabase
//Author:Alperen Aslan
//Definition : This class is for configuration between logs and database.
//Resource : https://spring.io/guides/tutorials/rest/
//------------------------------------------------------

@Configuration
class LoadDatabase {

	private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

	@Bean
	CommandLineRunner initDatabase(UserRepository repository) {

		return args -> {
			log.info("Preloading " + repository.save(new User("Abidal Friginnes")));
			log.info("Preloading " + repository.save(new User("Suleyman Savcioglu")));
		};
	}
}