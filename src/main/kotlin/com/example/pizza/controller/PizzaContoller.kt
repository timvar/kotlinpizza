package com.example.pizza.controller

import com.example.pizza.menu.StandardPizza
import com.example.pizza.repository.StandardPizzaRepository
import org.springframework.web.bind.annotation.*

@RestController
internal class PizzaController(private val repository: StandardPizzaRepository) {


    @GetMapping("/employees")
    fun all(): List<StandardPizza> {
        return repository.findAll()
    }
}
    /*

    // end::get-aggregate-root[]
    @PostMapping("/employees")
    fun newEmployee(@RequestBody newEmployee: Employee?): Employee {
        return repository.save(newEmployee)
    }

    // Single item
    @GetMapping("/employees/{id}")
    fun one(@PathVariable id: Long?): Employee {
        return repository.findById(id)
            .orElseThrow { EmployeeNotFoundException(id) }
    }

    @PutMapping("/employees/{id}")
    fun replaceEmployee(@RequestBody newEmployee: Employee, @PathVariable id: Long?): Employee {
        return repository.findById(id)
            .map { employee ->
                employee.setName(newEmployee.getName())
                employee.setRole(newEmployee.getRole())
                repository.save(employee)
            }
            .orElseGet {
                newEmployee.setId(id)
                repository.save(newEmployee)
            }
    }

    @DeleteMapping("/employees/{id}")
    fun deleteEmployee(@PathVariable id: Long?) {
        repository.deleteById(id)
    }

    init {
        this.repository = repository
    }
}
*/
