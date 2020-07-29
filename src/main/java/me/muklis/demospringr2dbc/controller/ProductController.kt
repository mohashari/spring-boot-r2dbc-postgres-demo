package me.muklis.demospringr2dbc.controller

import me.muklis.demospringr2dbc.model.Product
import me.muklis.demospringr2dbc.repo.ProductRepo
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Flux

@RestController
class ProductController {

    @Autowired
    lateinit var productRepo: ProductRepo

    @GetMapping("/product")
    fun getProduct(): Flux<Product> {
        return productRepo.findAll()
    }

}