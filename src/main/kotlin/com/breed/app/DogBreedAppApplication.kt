package com.breed.app

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan

@SpringBootApplication
@ComponentScan(basePackages = ["com.breed.app"])
class DogBreedAppApplication

fun main(args: Array<String>) {
    runApplication<DogBreedAppApplication>(*args)
}
