package com.estudandoweb.wsspringboot3.config;

import com.estudandoweb.wsspringboot3.entities.User;
import com.estudandoweb.wsspringboot3.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

// classe específica de configuração
@Configuration
@Profile("test") // permite rodar a config no perfil test
public class TestConfig implements CommandLineRunner {

    // injeção de dependência
    @Autowired
    private UserRepository userRepository;

    // método para executar o seu conteúdo junto com a aplicação
    @Override
    public void run(String... args) throws Exception {
        User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
        User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456");

        // salva os objetos instanciados como uma lista e insere no banco de dados
        userRepository.saveAll(Arrays.asList(u1, u2));
    }
}
