package com.estudandoweb.wsspringboot3.repositories;

import com.estudandoweb.wsspringboot3.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

// essa interface permite várias operações padrão com a entidade
public interface UserRepository extends JpaRepository<User, Long> {
}
