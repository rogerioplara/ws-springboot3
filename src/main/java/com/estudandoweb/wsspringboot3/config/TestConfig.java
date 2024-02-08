package com.estudandoweb.wsspringboot3.config;

import com.estudandoweb.wsspringboot3.entities.Order;
import com.estudandoweb.wsspringboot3.entities.User;
import com.estudandoweb.wsspringboot3.repositories.OrderRepository;
import com.estudandoweb.wsspringboot3.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.Instant;
import java.util.Arrays;

// classe específica de configuração
@Configuration
@Profile("test") // permite rodar a config no perfil test
public class TestConfig implements CommandLineRunner {

    // injeção de dependência
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private OrderRepository orderRepository;

    // método para executar o seu conteúdo junto com a aplicação
    @Override
    public void run(String... args) throws Exception {
        // mock data
        User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
        User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456");

        Order o1 = new Order(null, Instant.parse("2023-06-20T19:53:07Z"), u1);
        Order o2 = new Order(null, Instant.parse("2023-07-21T03:42:10Z"), u2);
        Order o3 = new Order(null, Instant.parse("2023-07-22T15:21:22Z"), u1);

        // salva os objetos instanciados como uma lista e insere no banco de dados
        userRepository.saveAll(Arrays.asList(u1, u2));
        orderRepository.saveAll(Arrays.asList(o1, o2, o3));
    }
}
