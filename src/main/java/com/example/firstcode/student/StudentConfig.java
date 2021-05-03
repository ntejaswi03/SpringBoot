package com.example.firstcode.student;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {
	
	private static final Logger log = LoggerFactory.getLogger(StudentConfig.class);
	
	@Bean
	CommandLineRunner commandLineRunner(StudentRepository repository) {
		
		log.info("#######################");
		log.info("Command Line Runner...");
		
		return args -> {
			
//			Student teja=	new Student(
//							1L,
//							"teja",
//							"teja308@gmail.com",
//							LocalDate.of(2000, 01, 10)
//			);
//			Student sri=	new Student(
//					2L,
//					"sri",
//					"sri308@gmail.com",
//					LocalDate.of(1990, 01, 10)
//					);
//			
//			List<Student> test = new ArrayList<Student>();
//			
//			test.add(teja);
//			test.add(sri);
			
//			repository.saveAll(test);
			
//			repository.save(teja);
//			repository.save(sri);
		};
	}

}
