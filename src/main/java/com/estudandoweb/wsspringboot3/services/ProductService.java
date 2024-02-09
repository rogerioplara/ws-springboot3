package com.estudandoweb.wsspringboot3.services;

import com.estudandoweb.wsspringboot3.entities.Product;
import com.estudandoweb.wsspringboot3.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

// @Component registra como um componente do spring para ser injetado com o @Autowired
// @Service é um registro específico para classes de servico
@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    public List<Product> findAll() {
        return repository.findAll();
    }

    public Product findById(Long id) {
        // uso do optional caso não tenha resultado, não gera nullpointer
        Optional<Product> obj = repository.findById(id);
        return obj.get();
    }

}
