package me.muklis.demospringr2dbc.repo;

import me.muklis.demospringr2dbc.model.AuUser;
import org.springframework.data.r2dbc.repository.R2dbcRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuUserRepo extends R2dbcRepository<AuUser, Integer> {

}
