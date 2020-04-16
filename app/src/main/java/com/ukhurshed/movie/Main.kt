package com.ukhurshed.movie

fun main(){
    val cat = Animal("Musya")
    cat.age = 7
    val dog = Animal("Lusya")
    print(dog.age)
    print(dog.age - cat.age)
}

fun multiple(first: Int = 0, second: Int){
    print("Result: ${first*second}")
}

class Animal(val name: String) {
    var age: Int = 6
}
