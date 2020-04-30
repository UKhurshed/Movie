package com.ukhurshed.movie

class Pageon{

    val name: String = " "
        get() = field.capitalize()


    var age: Int = 0
        get() {
            return field
        }
        set(value) {
            if (value > 0)
                field = value
        }

    override fun toString(): String {
        return "Name: $name \n age: $age"
    }
}