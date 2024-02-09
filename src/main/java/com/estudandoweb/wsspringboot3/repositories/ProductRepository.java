package com.estudandoweb.wsspringboot3.repositories;

import com.estudandoweb.wsspringboot3.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

// essa interface permite várias operações padrão com a entidade
public interface ProductRepository extends JpaRepository<Product, Long> {
}
