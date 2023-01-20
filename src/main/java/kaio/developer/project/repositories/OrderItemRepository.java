package kaio.developer.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import kaio.developer.project.entities.OrderItem;
import kaio.developer.project.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK>{

}
