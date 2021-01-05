package com.example.pizza.repository

import com.example.pizza.menu.StandardPizza
import org.springframework.data.jpa.repository.JpaRepository

interface StandardPizzaRepository : JpaRepository<StandardPizza, Long>