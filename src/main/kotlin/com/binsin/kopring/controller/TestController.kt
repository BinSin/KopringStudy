package com.binsin.kopring.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class TestController {

    @GetMapping("/")
    fun HelloWorld() = "Hello World!"

    @GetMapping("/test/{name}")
    fun printName(
        @PathVariable("name") name: String
    ) = "이름: $name"

    @GetMapping("/param")
    fun printParam(
        @RequestParam("age") age: Int,
        @RequestParam("name") name: String
    ) = "이름: $name, 나이: $age"

}