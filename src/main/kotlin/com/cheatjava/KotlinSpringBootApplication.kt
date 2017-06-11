package com.cheatjava

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
open class KotlinSpringBootApplication {

    companion object {
        @JvmStatic fun main(args: Array<String>) {
            SpringApplication.run(KotlinSpringBootApplication::class.java, *args)
        }
    }
}
