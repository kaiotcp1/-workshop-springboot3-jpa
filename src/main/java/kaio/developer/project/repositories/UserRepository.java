package kaio.developer.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import kaio.developer.project.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
