package by.trubetski.javaJwtApp.repositories;

import by.trubetski.javaJwtApp.models.User;
import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Repository;




import java.util.Optional;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {
    Optional<User>findByEmail(String email);
}
