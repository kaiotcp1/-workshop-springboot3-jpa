package kaio.developer.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import kaio.developer.project.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
