package com.estudandoweb.wsspringboot3.services;

import com.estudandoweb.wsspringboot3.entities.User;
import com.estudandoweb.wsspringboot3.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

// @Component registra como um componente do spring para ser injetado com o @Autowired
// @Service é um registro específico para classes de servico
@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public List<User> findAll(){
        return repository.findAll();
    }

    public User findById(Long id){
        // uso do optional caso não tenha resultado, não gera nullpointer
        Optional<User> obj = repository.findById(id);
        return obj.get();
    }

    public User insert(User obj){
        return repository.save(obj);
    }

    public void delete(Long id){
        repository.deleteById(id);
    }

}
