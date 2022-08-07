package josem111.data;

import josem111.data.repositories.IPersonRepository;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;

import static josem111.helpers.IHelpers.people;

/**
 * @ApplicationRunner:
 * Interface used to indicate that a bean should run when it is
 * contained within a SpringApplication. Multiple ApplicationRunner
 * beans can be defined within the same application context and can
 * be ordered using the Ordered interface or `@Order` annotation.
 * Sort of works like onMounted in Vue js, when the component first mounts
 * or runs, in this case when the application finishes its process on booting up.
 */
public class PersonDataLoader implements ApplicationRunner {
    private IPersonRepository personRepo;
    
    // constructor
    public PersonDataLoader(IPersonRepository personRepo) {
        this.personRepo = personRepo;
    }
    
    @Override
    public void run(ApplicationArguments args) throws Exception {
        // you can put what ever you'd like in here for when the
        // application starts. We will be using the saveAll method
        personRepo.saveAll(people);
    }
}













