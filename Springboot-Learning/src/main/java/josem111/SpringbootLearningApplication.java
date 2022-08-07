package josem111;

import josem111.entities.DepartmentEntity;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootLearningApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootLearningApplication.class, args);
		
		// var test = new DepartmentEntity(); WOULD GENERATE ALL NULL VALUES
		// only `deptId` would be null with the builder method
		var testEntity = DepartmentEntity.of(
			"HQ",
			"227 alias St",
			"23456"
		);
		
		System.out.println(testEntity);
	}

}
