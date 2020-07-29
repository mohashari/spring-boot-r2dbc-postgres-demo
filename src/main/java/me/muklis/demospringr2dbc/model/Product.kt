package me.muklis.demospringr2dbc.model

import org.springframework.data.annotation.Id
import javax.persistence.Entity

@Entity
class Product {

    @Id
    var id: Int = 0
    var name: String = ""
    var price: Long = 0L
    var quantity: Int = 0

}