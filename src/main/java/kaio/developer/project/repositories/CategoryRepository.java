package kaio.developer.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import kaio.developer.project.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
