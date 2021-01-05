package com.example.pizza.menu

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
class StandardPizza(
    var topping1: String,
    var topping2: String,
    @Id @GeneratedValue var id: Long? = null
    )