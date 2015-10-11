package ovcharche.repository;

import org.springframework.data.repository.CrudRepository;

import ovcharche.model.User;

public interface UserRepository extends CrudRepository<User, Integer> {
    User findByEmail(String email);
}
