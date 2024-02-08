package com.estudandoweb.wsspringboot3.repositories;

import com.estudandoweb.wsspringboot3.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

// essa interface permite várias operações padrão com a entidade
public interface OrderRepository extends JpaRepository<Order, Long> {
}
