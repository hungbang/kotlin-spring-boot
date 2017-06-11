package com.cheatjava.controller

import com.cheatjava.dataclass.Greeting
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import java.util.concurrent.atomic.AtomicLong

/**
 * Created by KAI on 6/11/17.
 */

@RestController
class GreetingController{
    val counter = AtomicLong()

    @GetMapping("/greeting")
    fun greeting(@RequestParam(value = "name", defaultValue = "World" ) name: String): Greeting{
        return Greeting(counter.incrementAndGet(), "Hello, $name")
    }
}