package com.bob

fun main(args: Array<String>) {
//    println("Hello kotlin")
//    Human().hello()
    val h = Human()
    h.hello()
    var age = 25
    age = age.plus(1)
    var weight = 66.5f
    var enroll: Boolean = true
    println(age)
}

class Human {
    fun hello() {
        println("Hello kotlin")
    }
}