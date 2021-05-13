package com.kevin.BackendInterview.BackendInterview

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
@RestController
class BackendInterviewApplication

fun main(args: Array<String>) {
	val runApplication = runApplication<BackendInterviewApplication>(*args)



}
