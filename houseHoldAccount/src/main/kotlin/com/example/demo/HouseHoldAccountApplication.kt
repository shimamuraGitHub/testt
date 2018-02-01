package com.example.demo

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
open class HouseHoldAccountApplication

fun main(args: Array<String>) {
    SpringApplication.run(HouseHoldAccountApplication::class.java, *args)
}
