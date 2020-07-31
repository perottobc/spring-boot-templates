package com.example.demo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class WebserviceApplication

fun main(args: Array<String>) {
	runApplication<WebserviceApplication>(*args)
}
