package kaio.developer.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import kaio.developer.project.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
