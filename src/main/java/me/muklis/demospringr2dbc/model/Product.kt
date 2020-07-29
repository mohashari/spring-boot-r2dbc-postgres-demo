package me.muklis.demospringr2dbc.model

import org.springframework.data.annotation.Id
import javax.persistence.Entity

@Entity
class Product {

    @Id
    val id: Int = 0
    val name: String = ""
    val price: Long = 0L
    val quantity: Int = 0

}