package me.muklis.demospringr2dbc.repo;

import me.muklis.demospringr2dbc.model.Product;
import org.springframework.data.r2dbc.repository.R2dbcRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepo extends R2dbcRepository<Product, Integer> {

}