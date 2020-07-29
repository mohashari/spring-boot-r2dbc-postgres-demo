package me.muklis.demospringr2dbc.controller;

import me.muklis.demospringr2dbc.model.AuUser;
import me.muklis.demospringr2dbc.repo.AuUserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
public class UserController {

    @Autowired
    private AuUserRepo auUserRepo;

    @GetMapping("/users")
    public Flux<AuUser> getAll() {
        return auUserRepo.findAll();
    }
}
