package com.estudandoweb.wsspringboot3.repositories;

import com.estudandoweb.wsspringboot3.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

// essa interface permite várias operações padrão com a entidade
public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
