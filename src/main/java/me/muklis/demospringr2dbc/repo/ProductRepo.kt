package me.muklis.demospringr2dbc.repo

import me.muklis.demospringr2dbc.model.Product
import org.springframework.data.r2dbc.repository.R2dbcRepository

interface ProductRepo : R2dbcRepository<Product, Int> {

}