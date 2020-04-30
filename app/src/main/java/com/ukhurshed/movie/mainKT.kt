package com.ukhurshed.movie

fun main(){

    var bmw = Car("легковой", "m3", 2006)
    bmw.printObject()
}

fun Car.printObject(){
    print("{Type:${typeOfCar.capitalize()}: Model:${model.capitalize()}: Year:$year ")
}