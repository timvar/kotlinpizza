package com.example.pizza

import com.example.pizza.menu.StandardPizza
import com.example.pizza.repository.StandardPizzaRepository
import org.slf4j.LoggerFactory
import org.springframework.boot.CommandLineRunner
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
internal class LoadDatabase {
    @Bean
    fun initDatabase(repository: StandardPizzaRepository): CommandLineRunner {
        return CommandLineRunner { args: Array<String?>? ->
            log.info("Preloading " + repository.save(StandardPizza("Ham", "Pineapple")))
            log.info("Preloading " + repository.save(StandardPizza("Shrimps", "Mushroom")))
        }
    }

    companion object {
        private val log = LoggerFactory.getLogger(LoadDatabase::class.java)
    }
}